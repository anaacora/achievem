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