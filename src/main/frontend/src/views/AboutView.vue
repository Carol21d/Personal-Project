<script setup>
import Navbar from '../components/Navbar.vue';
import Comentario from '../components/Comentario.vue';
import EditComentario from '../components/EditComentario.vue';
import Greeting from '../components/Greeting.vue';
import SocialNetwork from '../components/SocialNetwork.vue';
import CardDetails from '../components/CardDetails.vue'
</script>
<template>
  <div class="container">
    <Greeting class="saludo d-flex"/>
    <SocialNetwork/>
  </div>
  <v-card-title class="comentarios d-flex text-h6 text-md-h5 font-italic text-lg-h4">Comments</v-card-title>
  <CardDetails class="card-detail"/>
  <Comentario /> 
  <EditComentario/>
  <Navbar />
</template>

<style lang="scss" scoped>

.comentarios{
  position:absolute;
  left: 53%;
  top: 15%;
}
.card-detail{
  display: flex;
  position:absolute;
  right: 47%;
  bottom: 30%;
}
</style>
 

  
 
