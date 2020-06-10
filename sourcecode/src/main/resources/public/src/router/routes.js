import Vue from 'vue'
import VueRouter from 'vue-router'

import Dashboard from '../views/Dashboard.vue'
import Profile from '../views/Profile.vue'
import Goal from '../views/Goal.vue'
import Gamification from '../views/Gamification.vue'

Vue.use(VueRouter)

const routes = [{
    path: '/',
    name: 'Dashboard',
    component: Dashboard
  },
  /*{
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(webpackChunkName: "about" '../views/About.vue')
  },
  */
  {
    path: '/gamification',
    name: 'Gamification',
    component: Gamification
  },
  {
    path: '/goal',
    name: 'Goal',
    component: Goal
  },
  {
    path: '/profile',
    name: 'Profile',
    component: Profile,
    
  },
]

const router = new VueRouter({
  routes
})

export default router