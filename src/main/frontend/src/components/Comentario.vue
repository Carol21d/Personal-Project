<script>
export default {
    data()  {
        return {
        dialog: false,
        nameRules: [
            v => !!v || 'Name is required',
        ],
        comentarioRules: [
            v => !!v || 'Comentario is required',
        ],

        comentario: "",
        };

    },

    methods: {
      async save() {
            const { valid } = await this.$refs.form.validate();
            if (valid) {
                alert('comentario is valid');

                    this.dialog = false;
                }
            },
        },
    };

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
                
                    <v-form ref="form">
                    <v-container>
                        <v-row>
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="Name*" :rules="nameRules" required></v-text-field>
                            </v-col>
                            <v-col cols="12">
                                <v-textarea v-model="comentario" :rules="comentarioRules" required auto-grow
                                    variant="filled" color="deep-purple" label="Comentario*" rows="3"></v-textarea>
                            </v-col>
                        </v-row>
                    </v-container>
                </v-form>
           
                    <small>*indicates required field</small>
                </v-card-text>
                <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="blue-darken-1" variant="text" @click="dialog = false">
                        Close
                    </v-btn>
                    <v-btn color="blue-darken-1" variant="text" @click="save">
                        Save
                    </v-btn>
                </v-card-actions>
            </v-card>
        </v-dialog>
    </v-row>
</template>



