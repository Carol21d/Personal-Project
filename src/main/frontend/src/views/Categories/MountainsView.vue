<script setup>
import Navbar from '../../components/Navbar.vue';
import Card from '../../components/Card.vue';
import Greeting from '../../components/Greeting.vue';
import SocialNetwork from '../../components/SocialNetwork.vue'

</script>
<template>
    <div class=" background text-left relative">
            <Greeting class="saludo"/>
            <SocialNetwork/>
        <v-card-title class="acuaticos text-h6 text-md-h5 font-italic text-lg-h4">Mountains trails</v-card-title>
        <Navbar/>
        <Card />
    </div>
</template>
<style lang="scss" scoped>.background {
    overflow-y: scroll;
    height: 100%;
    background-image: url("../../src/assets/images/bg6.jpg");
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center center;
    z-index: -1;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    .saludo{
        position:absolute;
        left: 11%;
      }
      .acuaticos{
          position:absolute;
          left: 10%;
          top:17.2%;
          color: white;
            text-decoration: underline;
      }
  }
</style>
