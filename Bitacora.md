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
- Observamos que la herencia no era la mejor decisión debido
a que hacia rígido el código.
- Se observa las funciones que tienen diferentes comportamientos
  en este caso fly y quack y los agrupamos en un tipo de interfaz 
  FlyBehavior y QuackBehavior.
- Declaramos dentro de las variables estos comportamientos (las 
  interfaces FlyBehavior, QuackBehavior) y lo inicializamos en los 
  constructores de las clases hija o subclases. Esto hace que el código
  sea más flexible.
- Para tener un comportamiento dinámico y poder hacer cambios en tiempo
de ejecución sobre la marcha agregamos los sets en nuestra clase Duck 
  setFlyBehavior() y setQuackBehavior()
- Creamos otro tipo de pato ModelDuck donde en la clase ClienteDuck 
podemos realizar cambios en tiempo de ejecución.
- Al terminar el laboratorio nos damos cuenta de que la 
composición es mucho más flexible a la herencia esto
  ayuda de gran manera a la hora de hacer el mantenimiento.