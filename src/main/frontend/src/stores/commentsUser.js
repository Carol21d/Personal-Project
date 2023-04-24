import { defineStore } from "pinia";
import axios from "axios";

export const commentsStore = defineStore("commentsStore", {
    state: () => ({
        comments: [],
    }),

    actions: {
        async getAll(){
         const response = await axios.get("http://localhost:8080/api/comments");
         this.comments = response.data;
          return response.data;

        },

        async saveComments(comment) {
            const response = await axios.post(
                "http://localhost:8080/api/comments",
                comment
            );
        await  this.getAll();
            return response.data;
        },

        async editComment(comment, idComment) {
            const response = await axios.put(
                `http://localhost:8080/api/comments/${idComment}`,comment);
            await this.getAll();
            return response.data;
        },

        async deleteComments(id) {
        
                const response = await axios.delete(
                    `http://localhost:8080/api/comments/${id}`
                );
            await this.getAll();
                return response.status;
            },
           
            

        async fetchComments() {
           
                const response = await axios.get("http://localhost:8080/api/comments");
                return response.data;
          
            },
        },
    

        // mutations:{
        //     setComment(state,comments){
        //         state.comments = comments;
        //     },

        //     addComment(state,comment){
        //         state.comments.push(comment);
        //     },

        //     updateComment(state, updatedComment) {
        //         const index = state.comments.findIndex(
        //             (comment) => comment.id === updatedComment.id);
        //             if (index !== -1) {
        //                 state.comments.splice(index, 1, updatedComment);
                        
        //             }
        //         },

        //         removeComment (state, commentId){
        //             state.comments = state.comments.filter((comment) => comment.id !==commentId);
        //         },
        //     },
        });
                

