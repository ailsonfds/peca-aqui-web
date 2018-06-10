$('#carousel-how-work').owlCarousel({
  loop:false,
  margin:10,
  responsiveClass:true,
  responsive:{
      0:{
          items:1,
          nav:true
      },
      600:{
          items:2,
          nav:true,
          
      },
      1000:{
          items:3,
          nav:true,
      }
    }
});

$('#carousel-avaliable').owlCarousel({
  animateOut: 'slideOutDown',
  animateIn: 'flipInX',
  margin:30,
  smartSpeed: 300,
  loop:true,
  margin:10,
  items: 1,
  autoplay:true,
  autoplayTimeout: 2000,
  autoplayHoverPause:true
});

$('.play').on('click',function(){
    owl.trigger('play.owl.autoplay',[1000])
});

$('.stop').on('click',function(){
    owl.trigger('stop.owl.autoplay')
});


// Script para botão de voltar ao topo
// Exibe o botão conforme a rolagem da tela
$(document).ready(function() {
  $(window).scroll(function() {
    if($(this).scrollTop() >= 100){
      $('.go-top').fadeIn(300);
    } else  {
      $('.go-top').fadeOut(300);
    }
  });
  
  // Faz animação para subir a página
  $('.go-top').click(function () {
    event.preventDefault();
    $('html, body').animate({scrollTop: 0}, 500);
  });

});
