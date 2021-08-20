- Se comenzó el proyecto inicial de SimUduck con la 
  clase abstract Duck como padre y las clases Hijas MallardDuck y RedheadDuck 
  (Herencia). Aparentemente no existía ningún problema con el 
  diseño de la aplicación porque cumplía para sus dos clases hijas.
- La empresa decide que los patos vuelen, por lo tanto se agrega la función 
  fly() a la clase padre.
- Agregamos una nueva clase RubberDuck donde nos damos cuenta de que
este tipo de patos no graznan sino que emiten un chirrido por lo que se 
  sobreescribe la función quack, y tampoco vuelan por lo que modificamos
  la función fly(). Al hacer esto ya es un síntoma de mal
  olor debido a que violamos el principio de sustitución de Liskov.