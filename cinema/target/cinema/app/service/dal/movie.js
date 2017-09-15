"use strict";

(function () {

    angular.module("cinema").service("cinemaDal", ["dal", cinemaDal]);

    function cinemaDal (dal) {

        this.getMovies = function () {
            return dal.http.GET("rest/cinema/json");
        };

        this.addMoive = function (movieToSave) {
            return dal.http.POST("rest/cinema/json", movieToSave);
        };


    }
}());
