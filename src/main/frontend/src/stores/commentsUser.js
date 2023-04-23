import {defineStore} from "pinia";
import axios from "axios";

export const commentsStore = defineStore("commentsStore",{
    state: () => ({
        comments: [],
    }),


    actions:{
        async  saveComments(comment){
            try{
                const response = await axios.post("http://localhost:8080/api/comments",comment);
                console.log(response.status);
            }catch(error){
                console.error(error);
            }
        },


        async editComment(comment, id){
            try{
                const response = await axios.put("http://localhost:8080/api/comments/${id}", comment);
                console.log(response.status);
            }catch(error){
                console.error(error);

            }
        },

        async deleteComments(id) {
            try{
                const response = await axios.delete("http://localhost:8080/api/comments/${id}");
                console.log(response.status);
                return response.status;
            }catch(error){
                console.error(error);
            }

        },

        async fetchComments(){
            try{
                const response = await axios.get("http://localhost:8080/api/comments");
                this.comments = response.data;
            }catch(error){
                console.error(error);
            }
        },
    },
});