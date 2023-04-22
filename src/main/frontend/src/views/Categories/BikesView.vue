<script setup>
import Navbar from '../../components/Navbar.vue';
import Card from '../../components/Card.vue';
import Greeting from '../../components/Greeting.vue';
import SocialNetwork from '../../components/SocialNetwork.vue'

</script>
<template>
    <div class="text-left relative">
            <Greeting class="saludo"/>
            <SocialNetwork/>
        <v-card-title class="acuaticos text-h6 text-md-h5 font-italic text-lg-h4">Hiking Routes</v-card-title>
        <Navbar/>
        <Card />
    </div>
</template>
<style lang="scss" scoped>
.saludo{
    position:absolute;
    left: 11%;
}
 .acuaticos{
    position:absolute;
    left: 10%;
    top:17.2%;
 }
</style>
