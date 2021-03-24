/*Arquivo JavaScript*/

function Enviar(){
    var nome = document.getElementById("nomeid");
    if(nome.value != ""){
        alert('Obrigado Sr(a) ' + nome.value + ',' + ' Os seus dados foram enviados com sucesso!');
    }
}