<template>
  <div>
    <b-container class="bv-example-row" fluid>
      <b-row>
        <b-col sm="12" md="12" lg="12">
          <b-form @submit="onSubmit">
            <b-form-group id="exampleInputGroup1" label="Email address:" label-for="exampleInput1" description="We'll never share your email with anyone else.">
              <b-form-input id="exampleInput1" type="email" v-model="form.email" required placeholder="Enter email" size="lg"></b-form-input>
            </b-form-group>
            <b-form-group id="exampleInputGroup2" label="Your Name:" label-for="exampleInput2">
              <b-form-input id="exampleInput2" type="text" v-model="form.name" required placeholder="Enter name" size="lg"></b-form-input>
            </b-form-group>
            <b-form-group id="exampleInputGroup3" label="Gender:" label-for="exampleInput3">
              <b-form-select id="exampleInput3" :options="gender" required v-model="form.gender" size="lg"></b-form-select>
            </b-form-group>
            <b-button class="button-margin" type="submit" size="lg" variant="primary">Submit</b-button>
            <b-button class="button-margin" style="margin-top: 0.5em" type="reset" size="lg" variant="secondary">Reset</b-button>
          </b-form>
        </b-col>
        <b-col>

        </b-col>
      </b-row>
    </b-container>
  </div>
</template>

<script>
import router from '../router'
export default {
  name: 'chatt',
  data() {
    return {
      form: {
        email: '',
        name: '',
        gender: null,
        secret: 'S3CR3T'
      },
      gender: [
        { text: 'Select One', value: null },
        'Male', 'Female', 'Pet', 'Clown'
      ]
    }
  },
  methods: {
    onSubmit(evt) {
      evt.preventDefault()
      router.push('/chatt')
    }
  }
}
</script>

<style scoped>
.button-margin {
  width: 100%;
}
</style>

