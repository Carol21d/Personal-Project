<script setup>
import Navbar from '../components/Navbar.vue';
import Comentario from '../components/Comentario.vue';
import EditComentario from '../components/EditComentario.vue';
import Greeting from '../components/Greeting.vue';
import SocialNetwork from '../components/SocialNetwork.vue';
import CardDetails from '../components/CardDetails.vue'
import { commentsStore } from '../stores/commentsUser';
import {onBeforeMount} from 'vue';

import { useRouter } from 'vue-router';


const commentstore = commentsStore();


onBeforeMount(async() => {
   await commentstore.getAll();
});

 const router = useRouter();



 const goback = () =>{
   router.back();
  };




</script>
<template>
  <div class="wrapper ">
    <div class="container ">
      <Greeting class="saludo d-flex"/>
      <SocialNetwork/>
    </div>
    <div>
      <v-btn class="btn-back" prepend-icon="mdi-arrow-left" variant="tonal" v-on:click="goback()">Back
      </v-btn>
    </div>
    <v-card-title class="comentarios d-flex text-h6 text-md-h5 font-italic text-lg-h4">Comments</v-card-title>
    <Comentario /> 
    <div class="container-edit">
      <EditComentario class="editar" v-for="comments of commentstore.comments" :id="comments.id"   :name="comments.name" :comment="comments.comment"/>
    </div>
    
    
    <CardDetails class="card-detail"/>
    
    <Navbar />
  </div>
</template>
<style lang="scss" scoped>

.wrapper{

  .btn-back{
   display: flex;
   position: absolute;
   left: 10%;
   top: 12%;
  }

 
 .comentarios{
   position:absolute;
   left: 53%;
   top: 15%;
 }
 .card-detail{
   display: flex;
   position:absolute;
   right: 47%;
   bottom: 24%;
 }
 .container-edit{
  display: flex;
    flex-direction: column;
    align-items: flex-end;
    margin-bottom: 10px; 
   
   .editar{
       display: flex;
       flex-direction: row;
       align-items: center;
       margin-bottom: 10px; 
       position: relative;
       right: 3.4%;
      
   
   }

 }
  
}
</style>







 

  
 
