<script setup>
import { useRouter } from 'vue-router';

 const router = useRouter();

 function pageError(){
    router.push('/pageError');
 }


</script>
<template>
    <div class="wrapper">
        <v-btn icon="mdi-facebook" tile id="facebook"><v-icon large color="blue darken-2" v-on:click="pageError()"></v-icon></v-btn>
        <v-btn icon="mdi-twitter" tile id="twitter"><v-icon large color="blue lighten-1" v-on:click="pageError()"></v-icon></v-btn>
        <v-btn icon="mdi-instagram" tile id="instagram"><v-icon large color="red lighten-1" v-on:click="pageError()"></v-icon></v-btn>

    </div>
</template>
<style lang="scss" scoped>
.wrapper{
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    margin: .4%;
    gap: 1%;
}

</style>
  



    
