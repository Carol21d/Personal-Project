import { createRouter, createWebHistory } from 'vue-router'
import LandingView from '../views/LandingView.vue'
import Dashboard from '../views/Dashboardview.vue'
import AboutView from '../views/AboutView.vue'
import AquacticView from '../views/Categories/AquaticView.vue'
import BikesView from '../views/Categories/BikesView.vue'
import ClimbingView from '../views/Categories/ClimbingView.vue'
import MountainsView from '../views/Categories/MountainsView.vue'
import CombinedView from '../views/Categories/CombinedView.vue'
import PetsView  from '../views/Categories/PetsView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: LandingView
    },
    {
      path: '/dashboard',
      name: 'dashboard',
      // component:() => import('../views/Dashboardview.vue')
      component:Dashboard
    },
    {
      path: '/aquactic',
      name: 'aquactic',
      // component: () =>import('@/views/AquaticView.vue')
      component:AquacticView
    },
    {
      path: '/bikes',
      name: 'bike',
      component:BikesView
    },
    {
      path: '/climbing',
      name: 'climbing',
      component: ClimbingView
    },
    {
      path: '/combined',
      name: 'combined',
      component:CombinedView
    },
    {
      path: '/mountains',
      name: 'mountains',
      component: MountainsView
    },
    {
      path: '/pets',
      name: 'pets',
      component: PetsView
    }

  ]

  
})



export default router;