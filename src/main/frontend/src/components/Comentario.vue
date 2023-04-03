<script>
export default {
    data: () => ({
        dialog: false,
    }),
}
</script>

<template>
    <v-row justify="center mt-12">
        <v-dialog v-model="dialog" persistent width="600px">
            <template v-slot:activator="{ props }">
                <v-btn color="primary" v-bind="props">
                    AÑADIR COMENTARIO
                </v-btn>
            </template>
            <v-card>
                <v-card-title>
                    <span class="text-h5">FORMULARIO DE COMENTARIOS</span>
                </v-card-title>
                <v-card-text>
                    <v-container>
                        <v-row>
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="Name*" required></v-text-field>
                            </v-col>
                            <v-col cols="12">
                                <v-textarea v-model="comentario" auto-grow variant="filled" color="deep-purple"
                                    label="Comentario*" rows="1"></v-textarea>
                            </v-col>
                        </v-row>
                    </v-container>
                    <small>*indicates required field</small>
                </v-card-text>
                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="blue-darken-1" variant="text" @click="dialog = false">
                        Close
                    </v-btn>
                    <v-btn color="blue-darken-1" variant="text" @click="dialog = false">
                        Save
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-dialog>
    </v-row>
</template>



