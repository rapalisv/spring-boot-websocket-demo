<template>
  <div>
    <div v-for="msg in messages">
      <pre class="mt-3">{{ msg }}</pre>
    </div>
    <b-form-textarea id="textarea1" v-model="text" placeholder="Enter something" :rows="3" :max-rows="6">
    </b-form-textarea>
    <b-button @click="send()" style="margin-top: 1em; width: 100%" size="lg" variant="outline-success">Send</b-button>
  </div>
</template>
<script>
import SockJS from 'sockjs-client'
import Stomp from '@stomp/stompjs'
export default {
  name: 'chatt',
  data() {
    return {
      sockjs: null,
      stompClient: null,
      text: '',
      messages: []
    }
  },
  methods: {
    connect() {
    },
    send() {
      this.stompClient.send('/app/message', {}, this.text)
    }
  },
  created() {
    this.sockjs = new SockJS('http://localhost:9191/ws')
    this.stompClient = Stomp.over(this.sockjs)

    this.stompClient.connect({}, d => {
      console.log(d)
      this.stompClient.subscribe('/message', data => {
        console.log(data.body)
        this.messages.push(data.body)
      })
    })
  }
}
</script>
<style scoped>

</style>
