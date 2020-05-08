
/*

- Enunciado:

Vamos a realizar una versión inicial de la lista dinámica en Java, veamos sus métodos:

  - isEmpty(): indica si la lista esta o no vacía.
  - size(): indica el tamaño de la lista.
  - get(int index): devuelve el elemento que haya en esa posición, null si no se encuentra 
    o el index es incorrecto.
  - getNode(int index): devuelve el nodo que haya en esa posición, null si no se encuentra 
    o el index es incorrecto. Sera privado
  - getFirst(): devuelve el elemento del primer nodo, null si esta vacía la lista 
  - getLast(): devuelve el elemento del ultimo nodo, null si esta vacia la lista
  - addLast(T element): añade un elemento al final, retorna el elemento añadido.
  - addFirst(T element): añade un elemento al principio, retorna el elemento añadido.
  - add(T element, int index): añade un elemento en una posición concreta, 
    devuelve el objeto si es correcto y null si el index no es correcto.
  - toString(): muestra el contenido de la lista.

*/