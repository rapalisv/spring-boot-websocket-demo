<template>
  <b-container fluid>
    <b-row>
      <b-col sm="4" md="4" lg="3">Online</b-col>
      <b-col sm="8" md="8" lg="9">
        <chatt></chatt>
      </b-col>
    </b-row>
  </b-container>
</template>
<script>
import { Chatt } from './component-exporter'
export default {
  components: {
    Chatt
  }
}
</script>
<style scoped>

</style>

