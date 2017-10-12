import Vue from 'vue'
import Router from 'vue-router'
import {Login, Chatt} from '../components/component-exporter'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/chatt',
      name: 'chatt',
      component: Chatt
    }
  ],
  mode: 'history'
})
