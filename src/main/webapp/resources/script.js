document.getElementById("form").addEventListener("submit", function(event) {
    event.preventDefault();
    enviarRequisicao();
});

function enviarRequisicao() {
    const formulario = document.getElementById("form");
    const parametros =
        "nome=" + formulario.nome.value +
        "&email=" + formulario.email.value +
        "&sexo=" + formulario.sexo.value +
        "&dataChegada=" + formulario.dataChegada.value +
        "&noites=" + formulario.noites.value +
        "&qtdHospedes=" + formulario.qtdHospedes.value +
        "&mensagem=" + formulario.mensagem.value;

    const xhr = new XMLHttpRequest();
    xhr.open("GET", "formularioPreenchido.jsp?" + parametros, true);
    xhr.onreadystatechange = function() {
        if (xhr.readyState == XMLHttpRequest.DONE) {
            if (xhr.status == 200) {
                document.getElementById("resposta").innerHTML = xhr.responseText;
            } else {
                console.error("Erro na requisição: " + xhr.status);
            }
        }
    }

    xhr.send();
}