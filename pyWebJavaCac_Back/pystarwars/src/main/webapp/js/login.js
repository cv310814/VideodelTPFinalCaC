/* mail and password hardcodeados */
const mail = "pepito@mail.com"
const pass = "123456"

// obtener campos y boton enviar
const campoMail = document.querySelector("#email");

const campoPassword = document.querySelector("#password");

const botonEnviar = document.querySelector(".btn");

// agregar evento al sacar de foco ( click fuera de campo)

campoMail.addEventListener("blur", ()=> verificarCampoMail(campoMail));
campoPassword.addEventListener("blur", ()=> verificarCampoPassword(campoPassword));

//botonEnviar.addEventListener("onclick", ()=> verificarIngreso());

function verificarCampoMail(campo){
    console.log(campo.value)
    if (campo.value != "" && campo.value.length > 5){
        if(campo.value === mail) {
            campo.classList.remove('is-invalid');
            campo.classList.add('is-valid');
            return true;
        } else {
            campo.classList.remove('is-valid');
            campo.classList.add('is-invalid');
            return false;
        }
        
    } else {
        campo.classList.remove('is-valid');
        campo.classList.add('is-invalid');
        return false;
    }
}

function verificarCampoPassword(campo){
    console.log(campo.value)
    if (campo.value != "" && campo.value.length > 5){
        if(campo.value === pass) {
            campo.classList.remove('is-invalid');
            campo.classList.add('is-valid');
            return true;
        } else {
            campo.classList.remove('is-valid');
            campo.classList.add('is-invalid');
            return false;
        }
        
    } else {
        campo.classList.remove('is-valid');
        campo.classList.add('is-invalid');
        return false;
    }
}

// funcion para verificar datos
function verificarIngreso(){
    let msj = "";
    //buena practica
    const emailValido = verificarCampoMail(campoMail);
    const passValida = verificarCampoPassword(campoPassword);

    if( emailValido && passValida ){
        //msj = "Mail y Password correctos";
        //Guardar usuario para colocarlo en dashboard
        localStorage.setItem("usuario", campoMail.value);
        loginCorrecto();

    } else{
        msj = "Mail y/o Password incorrectos"
        alert(msj);
    }

    
}

function loginCorrecto() {
    window.location.replace("dashboard.html")
}