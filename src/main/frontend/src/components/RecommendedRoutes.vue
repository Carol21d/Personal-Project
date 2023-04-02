<script>
</script>
<template>
    <div>
        <v-hover v-slot="{ isHovering, props }">
            <v-card v-bind="props" :elevation="isHovering ? 24 : 6" class="mx-auto pa-6" max-width="350">
                <v-img class="align-end text-white" height="200" src="https://cdn.vuetifyjs.com/images/cards/docks.jpg"
                    cover>
                    <v-card-title>Top 10 Australian beaches</v-card-title>
                </v-img>

             <!-- encuentra errores aqui-->

                <v-card-text>
                    <div>Whitehaven Beach</div>

                    <div>Whitsunday Island, Whitsunday Islands</div>
                </v-card-text>

                <v-card-actions>
                    <v-btn color="orange">
                        Share
                    </v-btn>

                    <v-btn type="rounded" color="orange">
                        Explore
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-hover>





    </div>
</template>
<style lang="scss" scoped></style>