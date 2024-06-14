#language:es

Característica:Valdar el llenado de todos los campos
Yo como automatizador de gl
Necesito ingresar a la pagina de toolqa y llenar todos los campos del formulario
Para validar el funcionamiento del formulario

Escenario: llenar formulario
  Dado Ingrese a la pagina de toolqa
  Cuando llene todos los campos del formulario
  Entonces validar que los campos se guardaron correctamente
