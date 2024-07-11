/*CONSUMIR API*/
/* Evento al hacer click consulta api people*/
document.getElementById('misPersonajes').addEventListener('click', function (event) {
    event.preventDefault(); //Para evitar la accion del enlace
    cargarApi();
})
/* Funcion flecha debe ser asincrona para poder usar await o sea esperar
    que se cargue bien toda la info antes de cargar la siguiente linea
*/

const cargarApi = async () => {
    
    try {

        const res = await fetch ('https://swapi.info/api/people');

        console.log(res);

        // Ver si es correcto la consulta o respuesta
        if (res.status === 200) {
            const datos = await res.json();/* Uso await para esperar a cargar todos los datos*/

            let personajes = '';/* Aca se almacenan los personajes*/
            
            datos.forEach((element, index) => {
                /* Operador ternario para cambiar color si es par */
                const borderClass = (index % 2 === 0) ? 'border-light' : 'border-success';
                personajes += `
                                <div class="col-8 text-center mb-3 bg-transparent"> 
                                    <div class="card bg-transparent text-light ${borderClass} m-2 p-2">
                                        <div class="card-header ${borderClass}">${element.name}</div>
                                            <div class="card-body">
                                            <p class="card-text">Height:${element.height}</p>
                                            <p class="card-text">Mass:${element.mass}</p>
                                            <p class="card-text">Hair color:${element.hair_color}</p>
                                            <p class="card-text">Skin color:${element.skin_color}</p>
                                            <p class="card-text">Eye color:${element.eye_color}</p>
                                            <p class="card-text">Birth year:${element.birth_year}</p>
                                            <p class="card-text">Gender:${element.gender}</p>
                                        </div>
                                    </div>
                                </div>`;
                
            });
         
            document.getElementById('api').innerHTML = personajes;            

        } else if (res.status === 401) {
            console.log('La clave api es incorrecta');
        } else if (res.status === 404) {
            console.log('El personaje no existe');
        } else {
            console.log('Revisar clave algo malo paso')
        }                 
        
    } catch (error) {
        console.log(error)
    }

}

/*CONSUMIR API*/
/* Evento al hacer click consulta api vehiculos*/
document.getElementById('misVehiculos').addEventListener('click', function (event) {
    event.preventDefault(); //Para evitar la accion del enlace
    cargarVehiculos();
})
/* Funcion flecha debe ser asincrona para poder usar await o sea esperar
    que se cargue bien toda la info antes de cargar la siguiente linea
*/

/* Cargar vehiculos */

const cargarVehiculos = async () => {
    
    try {

        const res = await fetch ('https://swapi.info/api/vehicles');

        console.log(res);

        // Ver si es correcto la consulta o respuesta
        if (res.status === 200) {
            const datosVehiculos = await res.json();/* Uso await para esperar a cargar todos los datos*/

            let vehiculos = '';/* Aca se almacenan los vehiculos*/
            
            datosVehiculos.forEach((element, index) => {
                /* Operador ternario para cambiar color si es par */
                const borderClass = (index % 2 === 0) ? 'border-light' : 'border-success';
                vehiculos += `
                                <div class="col-8 text-center mb-3 bg-transparent"> 
                                    <div class="card bg-transparent text-light ${borderClass} m-2 p-2">
                                        <div class="card-header ${borderClass}">${element.name}</div>
                                            <div class="card-body">
                                            <p class="card-text">name:${element.name}</p>
                                            <p class="card-text">model:${element.model}</p>
                                            <p class="card-text">manufacturer:${element.manufacturer}</p>
                                            <p class="card-text">cost_in_credits:${element.cost_in_credits}</p>
                                            <p class="card-text">length:${element.length}</p>
                                            <p class="card-text">crew:${element.crew}</p>
                                            <p class="card-text">passengers:${element.passengers}</p>
                                            <p class="card-text">cargo_capacity:${element.cargo_capacity}</p>
                                            <p class="card-text">consumables:${element.consumables}</p>
                                            <p class="card-text">vehicle_class:${element.vehicle_class}</p>
                                        </div>
                                    </div>
                                </div>`;
                
            });
                   
            document.getElementById('api').innerHTML = vehiculos;            

        } else if (res.status === 401) {
            console.log('La clave api es incorrecta');
        } else if (res.status === 404) {
            console.log('El personaje no existe');
        } else {
            console.log('Revisar clave algo malo paso')
        }                 
        
    } catch (error) {
        console.log(error)
    }

}


/*CONSUMIR API*/
/* Evento al hacer click consulta api starships*/
document.getElementById('misstarships').addEventListener('click', function (event) {
    event.preventDefault(); //Para evitar la accion del enlace
    cargarStarships();
})

/* Cargar vehiculos */

const cargarStarships = async () => {
    
    try {

        const res = await fetch ('https://swapi.info/api/starships');

        console.log(res);

        // Ver si es correcto la consulta o respuesta
        if (res.status === 200) {
            const datosStarships = await res.json();/* Uso await para esperar a cargar todos los datos*/

            let starships = '';/* Aca se almacenan los vehiculos*/
            
            datosStarships.forEach((element, index) => {
                /* Operador ternario para cambiar color si es par */
                const borderClass = (index % 2 === 0) ? 'border-light' : 'border-success';
                starships += `
                                <div class="col-8 text-center mb-3 bg-transparent"> 
                                    <div class="card bg-transparent text-light ${borderClass} m-2 p-2">
                                        <div class="card-header ${borderClass}">${element.name}</div>
                                            <div class="card-body">
                                            <p class="card-text">model:${element.model}</p>
                                            <p class="card-text">manufacturer:${element.manufacturer}</p>
                                            <p class="card-text">cost_in_credits:${element.cost_in_credits}</p>                                            
                                            <p class="card-text">length:${element.length}</p>
                                            <p class="card-text">max_atmosphering_speed:${element.max_atmosphering_speed}</p>
                                            <p class="card-text">crew:${element.crew}</p>
                                            <p class="card-text">passengers:${element.passengers}</p>
                                            <p class="card-text">cargo_capacity:${element.cargo_capacity}</p>
                                            <p class="card-text">consumables:${element.consumables}</p>
                                            <p class="card-text">hyperdrive_rating:${element.hyperdrive_rating}</p>
                                            <p class="card-text">MGLT":${element.MGLT}</p>
                                            <p class="card-text">starship_class:${element.starship_class}</p>
                                        </div>
                                    </div>
                                </div>`;
                
            });
                   
            document.getElementById('api').innerHTML = starships;            

        } else if (res.status === 401) {
            console.log('La clave api es incorrecta');
        } else if (res.status === 404) {
            console.log('El personaje no existe');
        } else {
            console.log('Revisar clave algo malo paso')
        }                 
        
    } catch (error) {
        console.log(error)
    }

}