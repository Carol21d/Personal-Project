<script setup>
import { useRouter } from 'vue-router';



const router = useRouter();
const phrase = " !Oops...! Error Page Not Found";



const goback = () =>{
   router.back();
  };

</script>
<template>
    <div class="error">
       <v-container fluid>
        <v-row align="center" justify="center">
            <v-col cols="12">
                <h1>  ERROR 404</h1>
            </v-col>
            <v-col cols="12" class="text-center">
                <p>{{ phrase }}</p>
              <v-btn color="primary" v-on:click="goback()">Go Back</v-btn>
            </v-col>
        </v-row>
    </v-container>
    </div>
</template>
<style lang="scss" scoped>
h1{
    display: flex;
    justify-content: center;
    color: darkorange;
}
</style>
                 

        