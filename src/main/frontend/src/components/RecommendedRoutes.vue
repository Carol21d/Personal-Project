<script setup>
import {ref} from'vue';
import {useRouter} from 'vue-router';


const router = useRouter();
const item = ref ([
    { route: "/about"}
]);

 const topath = (index) =>{
    router.push(item.value[index].route);
 };

</script>
<template>
    <div class="ca"  @click="topath(0)">
        <div class=" text-left">
            <v-card-title class="rutas text-h6 text-md-h5 font-italic text-lg-h4" style="z-index:1">Favourites Routes</v-card-title>
        </div>
        <v-hover v-slot="{ isHovering, props }">
            <v-card v-bind="props" :elevation="isHovering ? 24 : 6" class=" mx-auto pa-6" max-width="500">
                <v-img class="align-end text-white" height="250" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
                    cover>
                    <v-card-title>Lorem ipsum</v-card-title>
                </v-img>
                <v-card-text>
                    <div>Whitehaven Beach</div>
                    <div>Whitsunday Island, Whitsunday Islands</div>
                </v-card-text>
                <v-card-actions>
                    <v-list class="justify-center ml-2">
                        <v-img width="35" aspect-ratio="16/9"  cover src="../../src/assets/images/icon-beach.png"
                            alt="icon-beach"></v-img>
                    </v-list>
                    <v-btn type="text" class="justify-center ml-10 mt-4 text-h6 text-md-h5 text-lg-h6" color="orange">Middle</v-btn>
                </v-card-actions>
            </v-card>
        </v-hover>
    </div>
</template>



<style lang="scss" scoped>
.rutas {
    position: absolute;
    bottom: 112%;
    left: 8%;
    font-family: Kalam !important;
    font-size: 40px;
    font-style: italic;
    font-weight: 600;
    color: white;
}

.ca {
    display: flex;
    position: relative;
    bottom: 9%;
    right:5%;
    
}
</style>

    
