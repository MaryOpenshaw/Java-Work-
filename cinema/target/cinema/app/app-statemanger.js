"use strict";
(function () {

    angular.module('cinema').config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise("dashboard");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard.html"
        }).state("addMovie", {
            url:"/addMovie",
            templateUrl:"app/feature/movies/addMovie/addMovie.html"

        }).state("getMovie", {
            url:"/getMovie",
            templateUrl:"app/feature/movies/getMovies/getMovie.html"

        })
    });
}());