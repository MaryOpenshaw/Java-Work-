(function() {

    var addMovieController =  function() {
        var vm = this;


    function init() {
        movieService.getMovie().then(function (results) {
          console.log ("in movies control" + results)
            vm.movies = results
        }, function (error) {
            vm.error = true;
            vm.errorMessage = error;
        })
    }
        init();
    };

    angular.module('cinema').controller('addMovieController', [movieService, addMovieController]);
}());


