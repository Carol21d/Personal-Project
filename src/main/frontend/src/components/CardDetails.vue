<script></script>
<template>
    <div class="wrapper">
       
        <v-hover v-slot="{ isHovering, props }">
            <v-card v-bind="props" :elevation="isHovering ? 24 : 6" class="detail mx-auto pa-6" max-width="800">
                <v-img class="align-end text-white" height="200" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
                    cover>
                    <v-card-title>Lorem ipsum</v-card-title>
                </v-img>
                
                    <v-card-subtitle>Location,Whitehaven Beach</v-card-subtitle>
                    <v-card-text class="text-justify ">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC,
                         making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more 
                         obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered 
                         the undoubtable source.</v-card-text>
                <v-card-actions>
                    
                      <v-card-text class="font-weight-black text-h6">12 Km.</v-card-text>
                      <v-spacer></v-spacer>
                      <div class="icons">
                          <v-icon size="x-large"  class="mr-4" color="#E9800D" icon="mdi-map-search-outline"></v-icon>
                          <v-icon size="x-large" class="mr-4" color="#000000" icon="mdi-tshirt-crew-outline"></v-icon>
                          <v-icon size="x-large" color="blue darken-2" icon="mdi-bottle-soda-classic"></v-icon>

                      </div>
             
                </v-card-actions>
            </v-card>
        </v-hover>
    </div>
</template>

<style lang="scss" scoped>
.wrapper {
    display: flex;
    position: absolute;
    left: 3%;
    bottom: 18%;

    .detail{
        height: 50%;
        width: 84%;
    }
}
</style>



    
    



    
