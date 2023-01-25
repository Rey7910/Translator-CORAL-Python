TRADUCTOR DE LENGUAJE CORAL A LENGUAJE PYTHON.

LENGUAJES DE PROGRAMACIÓN 2022-2

AUTORES:
- Reinaldo Toledo Leguizamon
- Santiago Hernandez Chaparro

Consideraciones:

El presente traductor corresponde al tercer trabajo de la asignatura.
En el mismo se lograron implementar exitosamente todas las estructuras del lenguaje CORAL
con su respectiva traducción a Python.

Debido a la naturaleza de la indentación en el lenguaje, se encontró un mayor nivel de complejidad
debido a la ausencia de tokens explícitos que señalen el inicio y fin de substatements por lo cual,
se tomó la decisión de implementar las indentaciones de forma sencilla a partir de las reglas, para así,
mantener la naturaleza del lenguaje sin tener que afectar la gramática.
No obstante, para los casos con muchas anidaciones o estrcuturas if, elseif, else, while, etc. que cuenten
con muchos substatements, la lógica de indentación puede tender fallar (sinceramente no es exacta)
Sin embargo, resulta una solución eficaz con los casos de prueba presentados en la plataforma y como se dijo anteriormente,
con códigos que no cuenten con muchas anidaciones o muchos substatements dentro de las estructuras de indentación.

En términos de traducción, se logró implementar exitosamente todas las reglas 
(incluyendo las reglas de entrada 'Get next input' que no estaban en los casos de prueba)

Por otra parte, dado que CORAL es un lenguaje de tipado donde toca especificar el tipo de dato de una variable antes de
usarla, y python no requiere esta estructura. La traducción se realizó de la siguiente manera:

-----------

CORAL: integer id
Python: id = 0

-----------

CORAL: float id
Python: id=0.0

-------------

CORAL: float array(2) id
Python: id=[0.0,0.0]

-------------
Así mismo, para las funciones matemáticas y la función RandomNumber que tiene CORAL, en la traducción a python se importan las
librerías math y random para acceder a las funciones que realizan la instrucción de forma equivalente.

Por último, para la modificación del tamaño de un arreglo en CORAL se realiza una asignación usando el método .size que cuentan
los arreglos en este lenguaje; para nuestra traducción a Python optamos por reescribir el arreglo con ceros hasta el valor indicado
en la asignación de CORAL, haciendo uso de un ciclo.

-------------------

CORAL: array.size = 9+4

Python: array = [0 for i in range(9+4)]

-------------------



ATT. 

Reinaldo Toledo Leguizamon
Santiago Hernandez Chaparro

Universidad Nacional de Colombia
Noviembre, 2022



