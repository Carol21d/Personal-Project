import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'



// import assets  from '../src/assets/reset.scss'



// import Vuetify
import 'vuetify/styles'
import { createVuetify } from 'vuetify'
import * as components from 'vuetify/components'
import * as directives from 'vuetify/directives'

const app = createApp(App)
const vuetify = createVuetify({
  
  
  //configuracion vuetify
  /* components: {
   defaults:{
     
    VNavigationDrawer:{
      railWidth: 200,
      elevation:10,
      rounded: 'md',
      
     },
   } 
  },*/
    components,
    directives,
  })

app.use(createPinia())
app.use(router)
app.use(vuetify)

// app.mount('#app')
 app.mount('#app')
