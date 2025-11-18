import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

//Componente de TypeScript
@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.html', //Acá ponemos la ruta de del HTML a "modificar". También podemos escribir el código HTML directamente ahí en vez de la ruta con template.
  styleUrl: './app.css', //Acá ponemos la ruta del CSS a "modificar". También podemos escribir el código de CSS directamente ahí en vez de la ruta con style.
})
export class App {
  /*city = navigator.geolocation.getCurrentPosition(function(position){
    const latitude = position.coords.latitude;
    const longitude = position.coords.longitude;
    return "Latitud: " + latitude + ", longitud: " + longitude;
  });*/
}
