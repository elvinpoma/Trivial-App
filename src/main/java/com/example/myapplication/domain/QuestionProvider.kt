package com.example.myapplication.domain

import com.example.myapplication.data.Pregunta

class QuestionProvider() {
    private val preguntas: List<Pregunta> = listOf(
        // ==========================================
        // CATEGORÍA: HARDWARE - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es el hardware de una computadora?",
            listOf(
                "Los programas instalados",
                "El internet",
                "Las partes físicas y tangibles",
                "El sistema operativo"
            ),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente es considerado el 'cerebro' de la computadora?",
            listOf("CPU", "Disco Duro", "Memoria RAM", "Tarjeta Gráfica"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Para qué sirve principalmente un teclado?",
            listOf(
                "Para escuchar música",
                "Para imprimir",
                "Para ver imágenes",
                "Para introducir datos y texto"
            ),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tipo de dispositivo es un ratón (mouse)?",
            listOf("De salida", "De entrada", "De almacenamiento", "De procesamiento"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significan las siglas PC?",
            listOf("Public Computer", "Printed Circuit", "Personal Computer", "Processor Control"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente muestra la información visual al usuario?",
            listOf("Monitor", "Disco duro", "Teclado", "Micrófono"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significan las siglas USB?",
            listOf(
                "Ultra Speed Band",
                "United System Base",
                "Unique Serial Binary",
                "Universal Serial Bus"
            ),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo se usa para obtener una copia en papel de un documento digital?",
            listOf("Escáner", "Impresora", "Monitor", "Proyector"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué unidad de medida de almacenamiento es mayor?",
            listOf("Kilobyte", "Megabyte", "Byte", "Gigabyte"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál de estos es un dispositivo de almacenamiento portátil?",
            listOf("Pendrive", "Memoria RAM", "Procesador", "Placa Base"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Para qué sirve la cámara web (webcam)?",
            listOf(
                "Para imprimir fotos",
                "Para escuchar música",
                "Para enfriar la computadora",
                "Para grabar video y hacer videollamadas"
            ),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un píxel?",
            listOf(
                "La unidad mínima de color que forma una imagen digital",
                "Un virus informático",
                "Un cable de red",
                "Una tarjeta gráfica"
            ),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecla se usa para borrar el carácter a la izquierda del cursor?",
            listOf("Suprimir", "Enter", "Retroceso", "Shift"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué empresa fabrica los procesadores Ryzen?",
            listOf("Intel", "AMD", "Apple", "Nvidia"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecla alterna entre letras mayúsculas y minúsculas permanentemente?",
            listOf("Shift", "Ctrl", "Alt", "Bloq Mayús"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál de estos componentes NO es hardware?",
            listOf("Disco Duro", "Windows 10", "Teclado", "Memoria RAM"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo digitaliza documentos físicos pasándolos a la computadora?",
            listOf("Impresora", "Proyector", "Escáner", "Webcam"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué empresa fabrica la consola PlayStation?",
            listOf("Microsoft", "Nintendo", "Sega", "Sony"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cómo se le llama comúnmente a una computadora portátil?",
            listOf("Laptop", "Desktop", "Smartphone", "Tablet"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente da energía eléctrica a toda la computadora?",
            listOf("La placa base", "La memoria RAM", "El procesador", "La fuente de alimentación"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa que un dispositivo sea 'inalámbrico'?",
            listOf(
                "Que no usa electricidad",
                "Que funciona sin cables físicos",
                "Que usa cables de fibra óptica",
                "Que no se puede mover"
            ),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es la función principal de los altavoces o parlantes?",
            listOf("Grabar audio", "Refrigerar el equipo", "Emitir sonido", "Mostrar imágenes"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo se usa para capturar tu voz en la computadora?",
            listOf("Micrófono", "Altavoz", "Teclado", "Auriculares"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo mezcla las funciones de teléfono móvil y computadora de bolsillo?",
            listOf("Smart TV", "Smartwatch", "Laptop", "Smartphone"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué parte de la PC guarda tus archivos, fotos y juegos incluso cuando está apagada?",
            listOf("Memoria RAM", "Caché", "Procesador", "Disco Duro"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué empresa fabrica el iPhone y los Mac?",
            listOf("Samsung", "Apple", "Microsoft", "Huawei"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cómo se llama la superficie táctil de las laptops que reemplaza al ratón?",
            listOf("Pantalla táctil", "Teclado", "Touchpad", "Scanner"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa 'clic derecho' en el ratón generalmente?",
            listOf(
                "Seleccionar el elemento",
                "Borrar el archivo",
                "Apagar la PC",
                "Abrir un menú contextual"
            ),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué cable se usa comúnmente para conectar la PC a un monitor o TV moderna?",
            listOf("Cable HDMI", "Cable USB", "Cable Ethernet", "Cable de audio"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'Smartwatch'?",
            listOf(
                "Un teléfono de escritorio",
                "Una televisión con internet",
                "Un reloj inteligente",
                "Un ratón inalámbrico"
            ),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál de estos periféricos es exclusivo para videojuegos?",
            listOf("Teclado", "Gamepad", "Ratón", "Monitor"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué luz nos indica que el disco duro está trabajando en una PC de escritorio?",
            listOf(
                "LED de actividad de disco",
                "Luz del teclado",
                "Luz del monitor",
                "LED de encendido"
            ),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología de pantallas es común en monitores modernos?",
            listOf("CRT", "Plasma", "Proyección láser", "LED o LCD"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa 'conectar en caliente' (hot-plug)?",
            listOf(
                "Conectar un equipo cuando hace calor",
                "Conectar un cable derretido",
                "Conectar un dispositivo sin tener que apagar la computadora",
                "Conectar un monitor directamente a la corriente"
            ),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es el medio de almacenamiento circular y brillante que usábamos antes de los USB?",
            listOf("Disquete", "CD o DVD", "Cinta magnética", "SSD"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo te pones en las orejas para escuchar audio privado?",
            listOf("Micrófono", "Altavoces", "Webcam", "Auriculares"),
            3,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tipo de puerto usan casi todos los ratones y teclados modernos con cable?",
            listOf("USB", "PS/2", "VGA", "HDMI"),
            0,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo lee códigos de barras en los supermercados?",
            listOf("Impresora 3D", "Micrófono", "Lector de código de barras", "Pantalla táctil"),
            2,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Cómo se llama la caja metálica o plástica que guarda los componentes de la PC?",
            listOf("Placa Base", "Gabinete", "Fuente de poder", "Monitor"),
            1,
            "Fácil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa tener una pantalla 'táctil'?",
            listOf(
                "Que solo funciona con un lápiz especial",
                "Que es frágil al tacto",
                "Que vibra cuando la tocas",
                "Que puedes interactuar tocándola con los dedos"
            ),
            3,
            "Fácil",
            "Hardware"
        ),

        // ==========================================
        // CATEGORÍA: HARDWARE - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué caracteriza a la memoria RAM en términos de retención de datos?",
            listOf("Es permanente", "Es magnética", "Es volátil", "Se borra manualmente"),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál de las siguientes resoluciones corresponde al estándar 'Full HD'?",
            listOf("1920 x 1080", "1280 x 720", "2560 x 1440", "3840 x 2160"),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es la memoria Caché en un procesador?",
            listOf(
                "Un disco duro virtual",
                "La tarjeta gráfica",
                "Una partición del SO",
                "Una memoria rápida que almacena datos de acceso frecuente"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es el propósito del sistema BIOS/UEFI en una placa base?",
            listOf(
                "Inicializar y probar el hardware durante el arranque",
                "Conectarse al Wi-Fi",
                "Almacenar fotos",
                "Refrigerar el procesador"
            ),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuántos bits componen un Byte?",
            listOf("4", "16", "8", "32"),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es el Overclocking?",
            listOf(
                "Sincronizar el reloj por internet",
                "Bloquear páginas web",
                "Cifrado militar",
                "Aumentar la velocidad de reloj de un componente por encima de fábrica"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué característica física destaca en el conector USB Tipo-C?",
            listOf("Es reversible", "Es triangular", "Solo pasa energía", "Es muy grande"),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Para qué sirve el disipador o 'Cooler' en una PC?",
            listOf(
                "Hacer el equipo silencioso",
                "Dar energía a la GPU",
                "Extraer el calor del procesador",
                "Filtrar el polvo"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente de una tarjeta gráfica equivale a la RAM del procesador?",
            listOf("SSD", "VRAM", "Caché L3", "Socket"),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es la función principal de la placa base (Motherboard)?",
            listOf(
                "Guardar archivos",
                "Proveer energía a la pantalla",
                "Enfriar la PC",
                "Conectar y comunicar todos los componentes"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un SSD en comparación con un HDD?",
            listOf(
                "Un disco duro mecánico",
                "Una unidad de estado sólido sin partes móviles y más rápida",
                "Una RAM externa",
                "Software de seguridad"
            ),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa la sigla GPU?",
            listOf(
                "General Purpose Utility",
                "Global Processing User",
                "Graphics Processing Unit",
                "Gaming Personal Unit"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significan las siglas SSD?",
            listOf(
                "Solid State Drive",
                "System Storage Disk",
                "Super Speed Drive",
                "Static System Data"
            ),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿En qué se mide la velocidad de reloj de un procesador moderno?",
            listOf("Megabytes", "Milivoltios", "Revoluciones por minuto", "Gigahertz"),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué puerto de video analógico era el estándar en los monitores antiguos antes del HDMI o DVI?",
            listOf("VGA", "DisplayPort", "USB", "FireWire"),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué batería pequeña en la placa base mantiene la hora y la configuración del BIOS cuando la PC está desenchufada?",
            listOf(
                "Batería de litio AA",
                "Batería de portátil",
                "Pila de botón",
                "Capacitor de arranque"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa 'Tasa de refresco' en un monitor?",
            listOf(
                "La rapidez con la que enciende",
                "La resolución máxima",
                "La cantidad de veces por segundo que actualiza la imagen",
                "El brillo máximo de la pantalla"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿En qué unidad se mide la tasa de refresco de un monitor?",
            listOf("FPS", "Hercios", "Píxeles", "Vatios"),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué función cumple la pasta térmica?",
            listOf(
                "Pega el procesador a la placa",
                "Evita cortocircuitos eléctricos",
                "Enfría la memoria RAM",
                "Mejora la transferencia de calor entre el procesador y el disipador"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es una fuente de alimentación 'Modular'?",
            listOf(
                "Que funciona con paneles solares",
                "Que no tiene cables integrados, conectas solo los necesarios",
                "Que cambia de colores",
                "Que genera su propia energía"
            ),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué formato físico de placa base es el más estándar y común en PC de escritorio tamaño torre?",
            listOf("Micro-ITX", "E-ATX", "ATX", "Mini-ATX"),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un sistema de refrigeración 'Líquida' o 'Watercooling'?",
            listOf(
                "Usar un circuito cerrado con líquido refrigerante para disipar el calor",
                "Enfriar la PC metiéndola en agua",
                "Un ventilador que echa agua",
                "Hielo seco dentro del gabinete"
            ),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué empresa fabrica la familia de procesadores 'Core' (i3, i5, i7, i9)?",
            listOf("AMD", "Intel", "Apple", "IBM"),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo protege a la computadora de subidas o picos de tensión en la red eléctrica?",
            listOf("Fuente de poder", "Cable de tierra", "Disipador", "Regulador de voltaje"),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tipo de cable utiliza luz para transmitir datos a alta velocidad?",
            listOf("Fibra Óptica", "Cable Coaxial", "Cable de Par Trenzado", "Cable HDMI"),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'Periférico'?",
            listOf(
                "El centro del procesador",
                "Un tipo de memoria",
                "Cualquier dispositivo auxiliar conectado a la CPU",
                "La carcasa de la PC"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es la función del motor en un disco duro mecánico (HDD)?",
            listOf(
                "Enfriar el disco",
                "Hacer girar los platos magnéticos",
                "Acelerar los datos por internet",
                "Hacer vibrar el equipo"
            ),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa la certificación '80 Plus' en una fuente de alimentación?",
            listOf(
                "Que da 80 voltios",
                "Que dura 80 meses",
                "Que soporta 80 grados de calor",
                "Que garantiza cierto nivel de eficiencia energética"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un puerto 'Ethernet' (RJ45)?",
            listOf(
                "Para conectar monitores",
                "Para impresoras antiguas",
                "Para conectar el cable de red",
                "Para micrófonos"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué resolución es conocida comercialmente como 4K?",
            listOf("1920x1080", "3840x2160", "2560x1440", "7680x4320"),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente almacena el firmware necesario para que un dispositivo funcione?",
            listOf("El disco duro", "La memoria RAM", "El procesador", "La memoria ROM"),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología de impresión utiliza polvo en lugar de tinta líquida?",
            listOf(
                "Inyección de tinta",
                "Impresora térmica",
                "Impresora Láser",
                "Impresora de impacto"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué puerto fue el precursor del USB para conectar impresoras en paralelo?",
            listOf("Puerto Serie", "FireWire", "PS/2", "Puerto Paralelo"),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'Socket' en una placa base?",
            listOf(
                "El zócalo donde se instala el procesador",
                "El conector de internet",
                "El puerto USB",
                "La ranura de la RAM"
            ),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa que un monitor tenga un panel 'IPS'?",
            listOf(
                "Que es curvado",
                "Que gasta menos energía",
                "Que ofrece mejores colores y ángulos de visión que un panel TN",
                "Que es táctil"
            ),
            2,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué dispositivo se usa comúnmente en diseño gráfico para dibujar directamente a la computadora?",
            listOf("Ratón gamer", "Tableta digitalizadora", "Escáner 3D", "Teclado mecánico"),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué diferencia a un teclado 'Mecánico' de uno de 'Membrana'?",
            listOf(
                "El de membrana es para jugar profesionalmente",
                "El mecánico no hace ruido",
                "No hay diferencia",
                "El mecánico usa resortes y un interruptor individual por tecla"
            ),
            3,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál de estos conectores soporta video y audio al mismo tiempo?",
            listOf("HDMI", "VGA", "DVI", "PS/2"),
            0,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es el 'Ping' o 'Input Lag' en un periférico?",
            listOf(
                "La velocidad máxima de internet",
                "El tiempo que tarda desde que haces una acción hasta que la PC la registra",
                "La duración de la batería",
                "El nivel de brillo"
            ),
            1,
            "Medio",
            "Hardware"
        ),
        Pregunta(
            "¿Qué memoria es más rápida pero tiene menos capacidad en un sistema?",
            listOf("RAM", "Disco Duro", "Pendrive", "Memoria Caché"),
            3,
            "Medio",
            "Hardware"
        ),

        // ==========================================
        // CATEGORÍA: HARDWARE - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿A qué se le llama el 'Cuello de botella de Von Neumann' en la arquitectura de computadoras?",
            listOf(
                "A la lentitud de los discos duros",
                "A la poca capacidad de los transistores",
                "Al límite de velocidad entre la CPU y la memoria por un bus compartido",
                "A la falta de energía"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué técnica permite a una CPU ejecutar múltiples instrucciones solapando las diferentes fases (fetch, decode, execute)?",
            listOf("Overclocking", "Thrashing", "Paging", "Pipelining"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué formato de SSD utiliza el bus PCIe ofreciendo velocidades mucho mayores que el SATA III?",
            listOf("M.2 NVMe", "HDD de 2.5\"", "mSATA", "eMMC"),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es la función del bus 'PCI Express' (PCIe) en una placa base?",
            listOf(
                "Conectar el teclado y ratón",
                "Conectar el equipo a la red eléctrica",
                "Permitir la conexión de tarjetas de expansión con alto ancho de banda",
                "Refrescar la memoria RAM"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa la tecnología 'Hyper-Threading' (o SMT)?",
            listOf(
                "Permitir que un solo núcleo físico actúe como dos núcleos lógicos",
                "Enfriar el procesador con nitrógeno",
                "Conectar varias tarjetas gráficas",
                "Acelerar la conexión a internet"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es el material semiconductor más utilizado en la fabricación de chips de procesadores modernos?",
            listOf("Cobre", "Silicio", "Grafeno", "Oro"),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "En la arquitectura de memorias, ¿cuál es el nivel de caché más pequeño y rápido integrado directamente en el núcleo de la CPU?",
            listOf("Caché L2", "Caché L3", "RAM", "Caché L1"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'SoC' (System on a Chip)?",
            listOf(
                "Un sistema operativo portátil",
                "Un circuito integrado que agrupa casi todos los componentes de una computadora en un solo chip",
                "Una placa base para servidores",
                "Un tipo de memoria RAM"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa 'TDP' (Thermal Design Power) en las especificaciones de un procesador?",
            listOf(
                "Total Data Processed",
                "El consumo eléctrico con la PC apagada",
                "La velocidad máxima en Turbo",
                "La cantidad máxima de calor que el sistema de refrigeración debe disipar"
            ),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué arquitectura de procesadores dominan los dispositivos móviles (Smartphones) por su eficiencia energética?",
            listOf("ARM", "x86", "MIPS", "PowerPC"),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué diferencia hay entre la arquitectura RISC y CISC?",
            listOf(
                "RISC es solo para discos duros y CISC para procesadores",
                "CISC tiene instrucciones complejas y RISC instrucciones reducidas y simples",
                "CISC es software libre",
                "RISC no utiliza RAM"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "En los discos duros, ¿qué tecnología permite unir varios discos físicos para que funcionen como una sola unidad lógica, mejorando velocidad o redundancia?",
            listOf("SATA", "AHCI", "RAID", "TRIM"),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es la velocidad máxima de transferencia teórica del estándar SATA III?",
            listOf("300 MB/s", "1 GB/s", "5 GB/s", "600 MB/s"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa la latencia 'CAS' en la memoria RAM (ej. CL16, CL18)?",
            listOf(
                "La capacidad total de la memoria",
                "Los ciclos de reloj que tarda la RAM en enviar un dato solicitado por la CPU",
                "El voltaje que necesita",
                "La frecuencia base en MHz"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología de las tarjetas gráficas Nvidia Tensor utiliza IA para reescalar imágenes y mejorar el rendimiento sin perder calidad visual?",
            listOf("Ray Tracing", "G-Sync", "DLSS", "CUDA"),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es el 'Thermal Throttling'?",
            listOf(
                "Una reducción automática en la velocidad del reloj para evitar daños por sobrecalentamiento",
                "Un programa de edición térmica",
                "Un sistema de enfriamiento líquido",
                "El apagado instantáneo de la PC"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué empresa adquirió ARM Holdings en 2016 (aunque luego Nvidia intentó comprarla sin éxito)?",
            listOf("Apple", "Intel", "Samsung", "SoftBank"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es el nombre del primer microprocesador comercial introducido por Intel en 1971?",
            listOf("Intel 8086", "Intel 4004", "Pentium", "Core 2 Duo"),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'Transistor' en electrónica digital?",
            listOf(
                "Un traductor de idiomas",
                "Un disco de almacenamiento",
                "Un componente que actúa como un interruptor o amplificador de señales eléctricas",
                "Un cable de fibra óptica"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué unidad mide la cantidad de operaciones en coma flotante por segundo de la que es capaz un procesador o GPU?",
            listOf("MIPS", "FLOPS", "IOPS", "Hertz"),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología sincroniza la tasa de refresco del monitor con los FPS que genera la tarjeta gráfica para evitar el 'tearing'?",
            listOf("HDR", "Anti-Aliasing", "Motion Blur", "FreeSync o G-Sync"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "En monitores y pantallas, ¿qué diferencia a la tecnología OLED del tradicional LCD/LED?",
            listOf(
                "En OLED cada píxel se ilumina a sí mismo, permitiendo negros puros",
                "OLED usa tubos de rayos",
                "OLED consume mucha más energía",
                "OLED no tiene colores"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué componente de hardware se encarga del cálculo y renderizado del 'Ray Tracing' en tiempo real?",
            listOf("CPU", "Memoria RAM", "Núcleos RT en la GPU", "El chipset de la placa base"),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es la VRAM GDDR6?",
            listOf(
                "Un disco duro portátil",
                "Un tipo de memoria RAM de alto rendimiento diseñada específicamente para tarjetas gráficas",
                "Un procesador de 6 núcleos",
                "Un protocolo de red"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué estándar de factor de forma pequeño (SFF) es el más popular para armar PCs compactas?",
            listOf("ATX", "Micro-ATX", "Pico-ITX", "Mini-ITX"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué diferencia la memoria SRAM de la DRAM?",
            listOf(
                "SRAM es más lenta y barata",
                "SRAM es memoria magnética",
                "SRAM no necesita ser refrescada constantemente y es mucho más rápida",
                "La DRAM se usa en pendrives"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "En un procesador, ¿qué función tiene el 'Branch Predictor'?",
            listOf(
                "Adivinar qué camino tomará un bucle o instrucción condicional para adelantar trabajo",
                "Enfriar los núcleos",
                "Aumentar el voltaje del reloj",
                "Controlar la tarjeta gráfica"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significan las siglas 'VRM' en una placa base?",
            listOf(
                "Virtual Reality Machine",
                "Video RAM Memory",
                "Variable Refresh Monitor",
                "Voltage Regulator Module"
            ),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es el 'Delidding' en el mundo del hardware para entusiastas?",
            listOf(
                "Limpiar el polvo de la PC",
                "Quitar la tapa metálica del procesador para cambiar la pasta térmica interna",
                "Eliminar archivos basura del disco",
                "Overclockear la tarjeta gráfica"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología de interfaz de almacenamiento fue diseñada específicamente para aprovechar la baja latencia y el paralelismo de los SSDs sobre PCIe?",
            listOf("SATA", "SCSI", "NVMe", "IDE"),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es un 'Chipset' en una placa base?",
            listOf(
                "Un set de herramientas para arreglar la PC",
                "El nombre comercial del procesador",
                "Una tarjeta de sonido externa",
                "El conjunto de circuitos integrados que gestionan la comunicación entre el procesador, RAM y periféricos"
            ),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa 'IOPS' a la hora de medir el rendimiento de un SSD?",
            listOf(
                "Input/Output Operations Per Second",
                "Internal Output Power System",
                "Integrated Operating Processor Speed",
                "Internet Over Protocol Security"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué ventaja aporta la memoria ECC usada en servidores?",
            listOf(
                "Es mucho más barata",
                "Acelera los gráficos en 3D",
                "Puede detectar y corregir los tipos más comunes de corrupción de datos internos",
                "No necesita electricidad para guardar datos"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué tecnología impulsada por AMD y chipslet design cambió la forma de fabricar CPUs frente a los diseños monolíticos de Intel?",
            listOf("HyperTransport", "Diseño basado en Chiplets", "Pipelining", "Turbo Boost"),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Cuál es el ancho de banda máximo teórico por carril (x1) de la interfaz PCIe 4.0?",
            listOf("250 MB/s", "1 GB/s", "4 GB/s", "2 GB/s"),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué es 'Coil Whine'?",
            listOf(
                "El ruido que hace un ventilador roto",
                "Un ruido agudo provocado por la vibración electromagnética de las bobinas en tarjetas gráficas o fuentes",
                "Un fallo de Windows",
                "El sonido del disco duro mecánico leyendo"
            ),
            1,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿A qué arquitectura de computadoras pertenece el modelo en el que las instrucciones y los datos se almacenan en memorias separadas?",
            listOf(
                "Arquitectura de Von Neumann",
                "Arquitectura Turing",
                "Arquitectura de Harvard",
                "Arquitectura x86"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué función tiene el circuito o componente llamado 'DAC' en equipos de audio o placas base?",
            listOf(
                "Convertir señales eléctricas analógicas en bits",
                "Aumentar el volumen del sistema",
                "Conectar micrófonos USB",
                "Convertir la información digital de audio en una señal analógica para auriculares o altavoces"
            ),
            3,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué son las instrucciones 'AVX' en un procesador moderno?",
            listOf(
                "Advanced Vector Extensions",
                "Antivirus por Hardware",
                "Un tipo de memoria virtual",
                "Una interfaz de video"
            ),
            0,
            "Difícil",
            "Hardware"
        ),
        Pregunta(
            "¿Qué significa la ley empírica conocida como 'Ley de Moore'?",
            listOf(
                "Que los discos duros se llenan cada dos años",
                "Que el software siempre se vuelve más lento",
                "Que el número de transistores en un microprocesador se duplica aproximadamente cada dos años",
                "Que la velocidad de internet siempre mejora"
            ),
            2,
            "Difícil",
            "Hardware"
        ),
        // ==========================================
        // CATEGORÍA: REDES - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es Internet?",
            listOf(
                "Un programa de edición",
                "Una red global de computadoras interconectadas",
                "Un tipo de cable",
                "Un sistema operativo"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo se usa comúnmente en casa para emitir la señal Wi-Fi?",
            listOf("Monitor", "Impresora", "Router", "Disco duro"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significan las siglas WWW en una dirección web?",
            listOf("World Wide Web", "World Web Windows", "Wide Web World", "Windows Wide Web"),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tecnología inalámbrica se usa para conectar dispositivos a muy corta distancia, como auriculares al móvil?",
            listOf("Fibra óptica", "Wi-Fi", "NFC", "Bluetooth"),
            3,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué necesitas obligatoriamente para navegar por páginas web?",
            listOf("Un antivirus", "Un navegador web", "Un micrófono", "Una cámara"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué término se usa para describir el envío de un archivo desde tu computadora a internet?",
            listOf("Renderizar", "Descargar", "Subir", "Compilar"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'enlace' o 'link' en una página web?",
            listOf(
                "Un tipo de virus",
                "Una imagen de fondo",
                "Un elemento que al hacer clic te lleva a otra página",
                "Una contraseña"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué cable se utiliza tradicionalmente para conectar físicamente una PC al router?",
            listOf("Cable Ethernet", "Cable HDMI", "Cable USB", "Cable VGA"),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué modo de los teléfonos móviles desactiva todas las conexiones inalámbricas?",
            listOf("Modo nocturno", "Modo ahorro de energía", "Modo avión", "Modo silencio"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es la 'Nube' (Cloud) en informática?",
            listOf(
                "Una red social",
                "El clima local",
                "Un antivirus",
                "Servidores en internet donde se almacena información"
            ),
            3,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo actúa como barrera de seguridad entre tu red privada e internet?",
            listOf("Ratón", "Firewall", "Teclado", "Monitor"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué símbolo es obligatorio en cualquier dirección de correo electrónico?",
            listOf("#", "$", "@", "&"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Para qué sirve el botón de 'Actualizar' o 'Refrescar' en un navegador web?",
            listOf(
                "Para volver a cargar el contenido de la página actual",
                "Para apagar el monitor",
                "Para borrar el historial",
                "Para cerrar la pestaña"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa que una conexión de internet es de 'Banda Ancha'?",
            listOf(
                "Que usa cables muy gruesos",
                "Que solo funciona de día",
                "Que permite la transmisión de datos a alta velocidad",
                "Que es gratuita"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál de estos es un navegador web desarrollado por Google?",
            listOf("Safari", "Chrome", "Firefox", "Edge"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'Proveedor de Servicios de Internet' (ISP)?",
            listOf(
                "Una marca de ordenadores",
                "La empresa que te vende la conexión a internet",
                "Un programa para hacer videollamadas",
                "El creador de una página web"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tecnología te permite hacer llamadas de voz a través de internet en lugar de la red telefónica tradicional?",
            listOf("Bluetooth", "Radio AM", "VoIP", "SMS"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Cómo se le llama al conjunto de reglas que permite la comunicación entre computadoras en una red?",
            listOf("Protocolo", "Algoritmo", "Lenguaje", "Sistema"),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Historial' en un navegador web?",
            listOf(
                "Las fotos descargadas",
                "Un registro de las páginas web que has visitado",
                "Tus contraseñas guardadas",
                "Los virus bloqueados"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué función tiene un buscador web como Google o Bing?",
            listOf(
                "Crear páginas web",
                "Traducir textos",
                "Encontrar información en internet mediante palabras clave",
                "Enviar correos electrónicos"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Spam' en el contexto del correo electrónico?",
            listOf(
                "Correo importante",
                "Correo basura o no deseado",
                "Un archivo adjunto seguro",
                "Una respuesta automática"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa estar 'Offline'?",
            listOf(
                "Estar conectado a alta velocidad",
                "Estar en una videollamada",
                "Estar desconectado de internet o de la red",
                "Estar usando el Bluetooth"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'Host' o anfitrión en una red?",
            listOf(
                "Cualquier computadora o dispositivo conectado a la red",
                "El cable principal",
                "El creador de internet",
                "La contraseña del Wi-Fi"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de red conecta dispositivos dentro de un área pequeña como una casa o una oficina?",
            listOf("WAN", "MAN", "LAN", "PAN"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo se encargaba antiguamente de modular y demodular señales a través de la línea telefónica?",
            listOf("Router", "Módem", "Switch", "Hub"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un archivo adjunto (attachment) en un correo electrónico?",
            listOf(
                "Un documento, imagen o archivo que se envía junto con el mensaje de texto",
                "La firma del remitente",
                "El asunto del mensaje",
                "La dirección de destino"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué indica el icono de un candado cerrado en la barra de direcciones del navegador?",
            listOf(
                "Que la conexión es segura y está cifrada",
                "Que la página está bloqueada",
                "Que necesitas una contraseña para entrar",
                "Que tu internet no funciona"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa la 'C' en 'CC' al enviar un correo electrónico?",
            listOf("Correo Cerrado", "Código Confidencial", "Con Copia", "Contacto Central"),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la función principal de la red celular (4G/5G)?",
            listOf(
                "Conectar el teclado al ordenador",
                "Proveer acceso inalámbrico a internet de largo alcance para dispositivos móviles",
                "Ver televisión por cable",
                "Refrigerar el teléfono"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Ancho de banda'?",
            listOf(
                "El tamaño físico del router",
                "La capacidad máxima de transferencia de datos de una conexión",
                "La distancia del Wi-Fi",
                "El precio del internet"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'Marcador' o 'Favorito' en un navegador?",
            listOf(
                "Una página guardada para acceder a ella rápidamente en el futuro",
                "Un virus",
                "Un anuncio molesto",
                "El botón de inicio"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué aplicación se usa comúnmente para compartir fotos y videos de forma efímera o permanente en redes?",
            listOf("Microsoft Excel", "Instagram", "Adobe Reader", "Notepad"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es una 'Dirección IP' de manera simplificada?",
            listOf(
                "El nombre del ordenador",
                "Un identificador único para un dispositivo en una red",
                "La contraseña del correo",
                "El modelo del router"
            ),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Ping' cuando juegas online?",
            listOf(
                "La medida de la velocidad a la que reacciona tu conexión",
                "La cantidad de memoria RAM usada",
                "La resolución de la pantalla",
                "El volumen del juego"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Para qué sirve un repetidor Wi-Fi?",
            listOf(
                "Para aumentar la velocidad contratada",
                "Para cambiar la contraseña",
                "Para ampliar el alcance de la señal inalámbrica",
                "Para crear una red nueva"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un enlace de 'Descarga'?",
            listOf(
                "Un botón que borra archivos",
                "Un texto que apaga la PC",
                "Una opción que transfiere un archivo de internet a tu dispositivo",
                "Un menú de configuración"
            ),
            2,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa la 'G' en 5G?",
            listOf("Gigabytes", "Global", "Gaming", "Generación"),
            3,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo se utiliza para navegar de forma táctil y portátil por internet?",
            listOf("Teclado", "Tablet", "Monitor", "Webcam"),
            1,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'dominio' en internet (ej. google.com)?",
            listOf(
                "Un nombre fácil de recordar asociado a una dirección IP",
                "El dueño de internet",
                "Un tipo de cable",
                "Un navegador"
            ),
            0,
            "Fácil",
            "Redes"
        ),
        Pregunta(
            "¿Qué acción permite compartir la conexión a internet de tu móvil con otros dispositivos?",
            listOf(
                "Activar el Bluetooth",
                "Poner el Modo Avión",
                "Crear un Punto de Acceso (Tethering)",
                "Apagar la pantalla"
            ),
            2,
            "Fácil",
            "Redes"
        ),

        // ==========================================
        // CATEGORÍA: REDES - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué protocolo se utiliza para la transferencia segura de páginas web?",
            listOf("HTTP", "HTTPS", "FTP", "SMTP"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué servicio se encarga de traducir nombres de dominio en direcciones IP?",
            listOf("DHCP", "FTP", "DNS", "ARP"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la función del protocolo DHCP en una red local?",
            listOf(
                "Asignar direcciones IP de forma dinámica y automática",
                "Bloquear páginas web",
                "Traducir nombres a IP",
                "Cifrar la conexión"
            ),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es una dirección MAC?",
            listOf(
                "Un identificador físico único asignado a la tarjeta de red de fábrica",
                "La IP pública del router",
                "La contraseña de Apple",
                "Un protocolo de seguridad"
            ),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuántos bits componen una dirección IPv4?",
            listOf("16 bits", "64 bits", "128 bits", "32 bits"),
            3,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de cable de par trenzado es comúnmente usado para redes Gigabit Ethernet?",
            listOf("Cat 3", "Cat 6", "Coaxial", "Fibra Óptica"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo de red conecta múltiples dispositivos en una red local (LAN) y envía los datos solo al dispositivo de destino?",
            listOf("Hub", "Switch", "Módem", "Repetidor"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué comando se utiliza en la consola para comprobar la conectividad básica con otro equipo en la red?",
            listOf("ipconfig", "traceroute", "ping", "netstat"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa VPN?",
            listOf(
                "Visual Private Network",
                "Virtual Public Node",
                "Virtual Private Network",
                "Variable Ping Number"
            ),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué puerto se asocia comúnmente al protocolo HTTP?",
            listOf("443", "80", "21", "25"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la principal ventaja de IPv6 sobre IPv4?",
            listOf(
                "Es más lento pero más seguro",
                "Utiliza nombres en lugar de números",
                "No requiere cables",
                "Ofrece una cantidad inmensamente mayor de direcciones disponibles"
            ),
            3,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo se utiliza comúnmente para enviar correos electrónicos?",
            listOf("POP3", "IMAP", "SMTP", "SNMP"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué diferencia a un Router de un Switch?",
            listOf(
                "El router conecta redes diferentes entre sí, el switch conecta dispositivos dentro de la misma red",
                "El router no usa cables",
                "El switch da internet directamente",
                "El router es solo para servidores"
            ),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es una Intranet?",
            listOf(
                "El internet público",
                "Una red privada interna exclusiva para los miembros de una organización",
                "Una red para jugar online",
                "El nombre técnico del Wi-Fi"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa 'Topología de red'?",
            listOf(
                "El sistema operativo de la red",
                "La distribución física o lógica de los dispositivos y cables en la red",
                "La velocidad de los datos",
                "El tipo de antivirus utilizado"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿En qué topología todos los dispositivos se conectan a un nodo central (como un switch)?",
            listOf("Malla", "Anillo", "Estrella", "Bus"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo se usa para transferir archivos entre un cliente y un servidor de red?",
            listOf("DNS", "FTP", "HTTP", "DHCP"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Phishing'?",
            listOf(
                "Un tipo de cable submarino",
                "Un intento de engañar al usuario para que revele información confidencial haciéndose pasar por una entidad de confianza",
                "Un sistema de refrigeración",
                "Una técnica para mejorar el Wi-Fi"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la función del comando 'tracert' o 'traceroute'?",
            listOf(
                "Borrar el caché de DNS",
                "Ver los saltos (routers) por los que pasa un paquete hasta llegar a su destino",
                "Medir la velocidad de descarga",
                "Cambiar la dirección IP"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo es más rápido pero no garantiza la entrega de los paquetes de datos (ej. usado en streaming o VoIP)?",
            listOf("TCP", "UDP", "ICMP", "ARP"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo asegura la entrega de paquetes ordenados y sin errores (ej. usado al cargar una web o descargar un archivo)?",
            listOf("UDP", "IP", "TCP", "MAC"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa WLAN?",
            listOf(
                "Wireless Local Area Network",
                "Wide Local Area Node",
                "Web Local Access Network",
                "Windows Local Area Network"
            ),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un ataque DDoS?",
            listOf(
                "Un virus que borra discos duros",
                "Sobrecargar un servidor con tráfico falso masivo para que deje de funcionar",
                "Robar contraseñas del Wi-Fi",
                "Un tipo de cifrado militar"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es la IP de Loopback estándar en IPv4 (localhost)?",
            listOf("192.168.1.1", "127.0.0.1", "0.0.0.0", "255.255.255.255"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué cifrado de Wi-Fi es el más recomendado actualmente por su seguridad en entornos domésticos?",
            listOf("WEP", "WPA3", "WPA", "Abierta"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué capa del modelo OSI se encarga del enrutamiento de paquetes y las direcciones lógicas (IP)?",
            listOf("Capa de Enlace de Datos", "Capa de Aplicación", "Capa de Red", "Capa Física"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo permite recuperar el correo electrónico de un servidor sincronizando carpetas en múltiples dispositivos?",
            listOf("SMTP", "POP3", "IMAP", "FTP"),
            2,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuál de las siguientes es una dirección IP privada (no enrutable en internet)?",
            listOf("8.8.8.8", "192.168.0.50", "1.1.1.1", "172.217.14.206"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa SSID en el contexto de las redes inalámbricas?",
            listOf(
                "La contraseña",
                "El nombre público de la red Wi-Fi",
                "El tipo de cifrado",
                "La velocidad máxima"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo conecta una LAN con otra red más grande (como internet)?",
            listOf("Switch", "Hub", "Access Point", "Router/Puerta de enlace"),
            3,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es una red WAN?",
            listOf(
                "Una red que cubre una amplia zona geográfica, como internet o redes entre ciudades",
                "Una red de una sola oficina",
                "Una red sin cables",
                "Una red de área personal"
            ),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de conector se utiliza en los cables de red Ethernet de par trenzado?",
            listOf("RJ-11", "RJ-45", "USB-C", "Coaxial"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué herramienta de software se usa para interceptar y analizar el tráfico de red?",
            listOf("Sniffer (ej. Wireshark)", "Navegador", "Antivirus", "Gestor de descargas"),
            0,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo se utiliza para acceder y gestionar un servidor de forma remota y segura mediante una terminal?",
            listOf("Telnet", "SSH", "FTP", "HTTP"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué comando en Windows muestra la configuración de red del equipo (IP, máscara, puerta de enlace)?",
            listOf("ifconfig", "ipconfig", "netstat", "route"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo resuelve el problema de la falta de direcciones IPv4 públicas permitiendo que múltiples dispositivos compartan una sola?",
            listOf("DNS", "NAT", "DHCP", "ARP"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué es una VLAN?",
            listOf(
                "Un virus de red local",
                "Una red de área local virtual creada a nivel lógico dentro de un switch físico",
                "Una red de área amplia",
                "Un protocolo de voz"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es el propósito de la Máscara de Subred?",
            listOf(
                "Ocultar la IP real",
                "Separar la porción de red y la porción de host en una dirección IP",
                "Cifrar la contraseña",
                "Acelerar la conexión"
            ),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué servidor público de DNS pertenece a Google?",
            listOf("1.1.1.1", "8.8.8.8", "9.9.9.9", "208.67.222.222"),
            1,
            "Medio",
            "Redes"
        ),
        Pregunta(
            "¿Qué diferencia al protocolo POP3 del IMAP?",
            listOf(
                "POP3 descarga los correos al dispositivo local y suele borrarlos del servidor",
                "No hay diferencia",
                "POP3 es más moderno",
                "POP3 solo envía correos, no los recibe"
            ),
            0,
            "Medio",
            "Redes"
        ),

        // ==========================================
        // CATEGORÍA: REDES - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Cuántas capas tiene el modelo OSI?",
            listOf("4", "5", "7", "9"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿En qué capa del modelo OSI opera el protocolo TCP?",
            listOf("Capa de Enlace", "Capa de Red", "Capa de Transporte", "Capa de Aplicación"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo enruta el tráfico principal de Internet entre sistemas autónomos (AS)?",
            listOf("OSPF", "RIP", "EIGRP", "BGP"),
            3,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es el puerto estándar asociado al protocolo HTTPS?",
            listOf("80", "443", "22", "21"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo utiliza el comando ping para enviar solicitudes de eco y recibir respuestas?",
            listOf("UDP", "TCP", "ICMP", "IGMP"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dirección IPv4 representa el broadcast en la red 192.168.1.0/24?",
            listOf("192.168.1.1", "192.168.1.254", "192.168.1.255", "192.168.255.255"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo se encarga de resolver una dirección IP conocida en una dirección física MAC en una red local?",
            listOf("DNS", "DHCP", "ARP", "RARP"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Three-Way Handshake' (Apretón de manos de tres vías)?",
            listOf(
                "El proceso de cifrado de WPA2",
                "El proceso de conexión inicial del protocolo TCP (SYN, SYN-ACK, ACK)",
                "Un tipo de ataque informático",
                "El reinicio de un router"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "En una dirección IPv6, ¿cuántos caracteres hexadecimales conforman un grupo o hexteto?",
            listOf("2", "4", "6", "8"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la máscara de subred equivalente al prefijo CIDR /26?",
            listOf("255.255.255.0", "255.255.255.128", "255.255.255.192", "255.255.255.224"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué capa del modelo TCP/IP es equivalente a la combinación de las capas de Sesión, Presentación y Aplicación del modelo OSI?",
            listOf(
                "Capa de Acceso a la Red",
                "Capa de Internet",
                "Capa de Transporte",
                "Capa de Aplicación"
            ),
            3,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué dispositivo opera en la Capa 2 (Enlace de Datos) del modelo OSI y reenvía tramas usando direcciones MAC?",
            listOf("Router", "Hub", "Switch", "Firewall"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué campo de un paquete IP evita que este viaje indefinidamente por la red si hay un bucle de enrutamiento?",
            listOf("Checksum", "TTL (Time to Live)", "Fragment Offset", "Protocol"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo de enrutamiento interior (IGP) utiliza el algoritmo de Dijkstra para calcular el camino más corto (Link-State)?",
            listOf("RIP", "OSPF", "BGP", "STP"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo evita la formación de bucles lógicos en topologías de red redundantes con múltiples switches?",
            listOf("DHCP", "STP (Spanning Tree Protocol)", "NAT", "VLAN"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué puerto TCP utiliza por defecto el protocolo SSH para conexiones seguras?",
            listOf("20", "21", "22", "23"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa CSMA/CD en redes Ethernet?",
            listOf(
                "Un tipo de cable de fibra óptica",
                "Un protocolo de acceso al medio que detecta colisiones antes de transmitir datos",
                "Un protocolo de seguridad inalámbrica",
                "Una herramienta de diagnóstico"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué técnica permite ocultar múltiples IPs privadas detrás de una sola IP pública traduciendo los puertos de origen?",
            listOf("Static NAT", "PAT / NAT Overload", "VLAN Tagging", "Subnetting"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el 'Subnetting'?",
            listOf(
                "El proceso de dividir una red física en varias redes lógicas más pequeñas",
                "Crear una VPN",
                "Cambiar la dirección MAC",
                "Descargar archivos mediante P2P"
            ),
            0,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál de las siguientes direcciones IPv4 no es válida para ser asignada a un host?",
            listOf("10.0.0.5", "172.16.20.1", "127.0.0.1", "192.168.1.300"),
            3,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de registro DNS asocia un nombre de host con una dirección IPv6?",
            listOf("A", "AAAA", "CNAME", "MX"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué protocolo de red se utiliza para la sincronización precisa de relojes en sistemas informáticos?",
            listOf("NTP", "FTP", "SNMP", "SMTP"),
            0,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tamaño tiene la cabecera estándar de un paquete IPv4 (sin opciones)?",
            listOf("10 bytes", "32 bytes", "20 bytes", "64 bytes"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es la función del registro MX en un servidor DNS?",
            listOf(
                "Definir la IP del servidor web",
                "Indicar el servidor de correo electrónico responsable de aceptar mensajes para el dominio",
                "Crear un alias de dominio",
                "Registrar la dirección IPv6"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "En el contexto de fibra óptica, ¿qué diferencia a la fibra Monomodo de la Multimodo?",
            listOf(
                "La monomodo es más gruesa",
                "La monomodo permite alcanzar mayores distancias y velocidades superiores usando láser",
                "La multimodo es exclusiva para internet",
                "No hay diferencia"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de firewall filtra el tráfico analizando la conexión completa y el estado de los paquetes en lugar de solo reglas estáticas?",
            listOf("Stateless Firewall", "Proxy Firewall", "Stateful Firewall", "WAF"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa el término 'Anycast' en redes IPv6 e IPv4?",
            listOf(
                "Enviar a todos los hosts de la red",
                "Enviar a un host específico",
                "Una dirección compartida por varios servidores; el enrutador entrega al más cercano",
                "No existe ese término"
            ),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué estándar de la IEEE define las especificaciones para las redes inalámbricas (Wi-Fi)?",
            listOf("IEEE 802.3", "IEEE 802.11", "IEEE 802.1Q", "IEEE 802.15"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué estándar de la IEEE define las especificaciones para VLANs y el etiquetado de tramas (VLAN Tagging)?",
            listOf("802.11", "802.3", "802.1Q", "802.1X"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es un 'DMZ' (Zona Desmilitarizada) en arquitectura de red?",
            listOf(
                "Una subred que expone servicios externos a internet mientras protege la red local interna",
                "Un software antivirus",
                "Un tipo de cable de red blindado",
                "Un comando para apagar routers"
            ),
            0,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué puerto TCP utiliza comúnmente el protocolo DNS para transferencias de zona, y qué puerto UDP para consultas regulares?",
            listOf("TCP 80 y UDP 443", "TCP 53 y UDP 53", "TCP 21 y UDP 22", "TCP 25 y UDP 110"),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es el espacio de direcciones reservado para 'APIPA' (Automatic Private IP Addressing) en Windows?",
            listOf("10.x.x.x", "172.16.x.x", "192.168.x.x", "169.254.x.x"),
            3,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tipo de ataque intercepta la comunicación entre dos partes sin que estas se den cuenta?",
            listOf(
                "Denial of Service (DoS)",
                "Man in the Middle (MitM)",
                "SQL Injection",
                "Brute Force"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es IPSec?",
            listOf(
                "Un antivirus de red",
                "Una suite de protocolos para asegurar las comunicaciones IP mediante autenticación y cifrado",
                "Un modelo físico de cableado",
                "Una versión antigua de IPv4"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "En una trama Ethernet II, ¿cuál es el tamaño máximo estándar de la carga útil (Payload / MTU)?",
            listOf("1500 bytes", "1024 bytes", "65535 bytes", "9000 bytes"),
            0,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es el protocolo SNMP?",
            listOf(
                "Un protocolo para enviar correos masivos",
                "Un protocolo de la capa de aplicación utilizado para gestionar y monitorizar dispositivos de red",
                "Un enrutador dinámico",
                "Un protocolo de resolución de nombres"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué es 'Multiplexación' en redes de telecomunicaciones?",
            listOf(
                "Usar múltiples contraseñas",
                "Combinar múltiples señales lógicas o físicas en un solo medio de transmisión",
                "Multiplicar la velocidad del router",
                "Conectar varios teclados"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué tecnología utiliza la red de anonimato Tor para enrutar el tráfico a través de múltiples nodos?",
            listOf("Subnetting", "VLAN Routing", "Onion Routing (Enrutamiento de cebolla)", "OSPF"),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Qué significa la sigla 'SDN' en el diseño de redes modernas?",
            listOf(
                "System Domain Node",
                "Secure Data Network",
                "Software-Defined Networking",
                "Static Dynamic NAT"
            ),
            2,
            "Difícil",
            "Redes"
        ),
        Pregunta(
            "¿Cuál es el propósito del protocolo BFD (Bidirectional Forwarding Detection)?",
            listOf(
                "Descargar archivos a doble velocidad",
                "Detectar rápidamente fallos en el camino de reenvío entre dos dispositivos de red",
                "Cifrar bases de datos",
                "Asignar IPs en ambas direcciones"
            ),
            1,
            "Difícil",
            "Redes"
        ),
        // ==========================================
        // CATEGORÍA: PROGRAMACIÓN - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es un algoritmo en programación?",
            listOf(
                "Un virus informático",
                "Un lenguaje de diseño",
                "Una serie de pasos lógicos para resolver un problema",
                "Una pieza de hardware"
            ),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una variable?",
            listOf(
                "Un tipo de pantalla",
                "Un espacio en memoria para almacenar un dato",
                "Un error del sistema",
                "Un comando para apagar la PC"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa 'Debugging'?",
            listOf(
                "El proceso de identificar y corregir errores en el código",
                "Instalar un programa",
                "Borrar todos los archivos",
                "Crear una base de datos"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es el lenguaje estándar para definir la estructura de las páginas web?",
            listOf("Python", "HTML", "C++", "Java"),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje se utiliza principalmente para dar estilo visual a una página web?",
            listOf("CSS", "SQL", "PHP", "Ruby"),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué símbolo se utiliza comúnmente para asignar un valor a una variable en la mayoría de lenguajes?",
            listOf("==", "=>", "=", "->"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un bucle o 'loop'?",
            listOf(
                "Una estructura que repite un bloque de código",
                "Un error de conexión",
                "Una imagen circular",
                "Una función que apaga el programa"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál de estos es un lenguaje de programación multiparadigma muy popular para análisis de datos y web?",
            listOf("HTML", "CSS", "Photoshop", "Python"),
            3,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué representa el tipo de dato 'String'?",
            listOf(
                "Una cadena de texto",
                "Un número decimal",
                "Un valor verdadero o falso",
                "Un arreglo de números"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa 'compilar' código?",
            listOf(
                "Copiar el código a otro archivo",
                "Traducir el código fuente a lenguaje máquina para que la computadora lo entienda",
                "Borrar líneas de código innecesarias",
                "Subir el código a internet"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué son las siglas IDE?",
            listOf(
                "Internet Data Explorer",
                "Integrated Development Environment",
                "Internal Device Emulator",
                "Intelligent Design Element"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué estructura de control condicional es la más básica y común?",
            listOf("try-catch", "for-loop", "if-else", "switch-case"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Para qué sirve el comando 'print' o 'console.log'?",
            listOf(
                "Para borrar un archivo",
                "Para mostrar información o resultados en la pantalla",
                "Para imprimir en papel físicamente",
                "Para apagar el monitor"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué valor representa la negación o el estado 'falso' en lógica booleana?",
            listOf("True", "Null", "False", "Undefined"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un arreglo, matriz o 'array'?",
            listOf(
                "Un único número entero",
                "Una colección ordenada de elementos almacenados en memoria",
                "Un tipo de monitor",
                "Un error lógico"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué operador matemático se usa frecuentemente para obtener el resto de una división entera?",
            listOf("Módulo (%)", "Exponente (^)", "División (/)", "Suma (+)"),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "En la inmensa mayoría de lenguajes de programación, ¿cuál es el índice del primer elemento en un arreglo?",
            listOf("1", "-1", "A", "0"),
            3,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa 'comentar' el código?",
            listOf(
                "Escribir notas de texto que el compilador o intérprete ignorará",
                "Enviar el código por correo",
                "Darle 'like' a un proyecto",
                "Traducirlo a otro idioma"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué popular lenguaje de programación fue creado por Microsoft y es pilar del framework .NET?",
            listOf("C#", "Swift", "Java", "Go"),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una 'función' o 'método'?",
            listOf(
                "Un disco de almacenamiento extra",
                "Un bloque de código reutilizable que realiza una tarea específica",
                "Un tipo de cable de red",
                "Una aplicación de celular"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje histórico es la base tradicional del desarrollo nativo para aplicaciones de Android?",
            listOf("Ruby", "PHP", "Java", "C"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué palabra reservada se usa comúnmente para devolver un valor desde dentro de una función?",
            listOf("break", "continue", "yield", "return"),
            3,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué tipo numérico se utiliza para almacenar números con decimales?",
            listOf("Float o Double", "Integer", "Boolean", "Char"),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es el 'código fuente'?",
            listOf(
                "El conjunto de instrucciones escritas por el programador en formato texto",
                "El manual de instrucciones físico",
                "El disco duro de la PC",
                "La energía eléctrica del procesador"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué plataforma web es la más famosa para alojar repositorios de código usando control de versiones?",
            listOf("Facebook", "Netflix", "GitHub", "StackOverflow"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué hace un desarrollador 'Frontend'?",
            listOf(
                "Configura bases de datos",
                "Programa la interfaz visual y la interacción que experimenta el usuario",
                "Monta los servidores físicos",
                "Instala sistemas operativos"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué hace un desarrollador 'Backend'?",
            listOf(
                "Diseña los logotipos",
                "Programa la lógica interna, servidores y bases de datos invisibles para el usuario",
                "Arregla ordenadores rotos",
                "Traduce la página a otros idiomas"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa hacer una 'Query' en bases de datos?",
            listOf(
                "Realizar una consulta para extraer o manipular información",
                "Borrar la base de datos por completo",
                "Comprar espacio de almacenamiento",
                "Instalar el motor de la base de datos"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué término se usa cuando el código fuente de un programa es accesible y modificable por la comunidad?",
            listOf("Código Cifrado", "Open Source", "Freeware", "Malware"),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué comando de la herramienta Git se utiliza para subir tus cambios locales al servidor remoto?",
            listOf("git pull", "git status", "git commit", "git push"),
            3,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje de programación tiene como mascota oficial una taza de café?",
            listOf("Python", "JavaScript", "Java", "C++"),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué son las siglas API?",
            listOf(
                "Application Programming Interface",
                "Advanced Program Integration",
                "Automated Processing Intelligence",
                "Application Process Internal"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje es el estándar para realizar consultas en bases de datos relacionales?",
            listOf("SQL", "HTML", "C", "Bash"),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un 'Framework'?",
            listOf(
                "Un disco duro virtual",
                "Un editor de texto simple",
                "Un esquema de trabajo con herramientas y reglas predefinidas para agilizar el desarrollo",
                "Un lenguaje de programación visual"
            ),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una 'Librería' o 'Biblioteca' en programación?",
            listOf(
                "Un conjunto de código preescrito que puedes invocar para resolver problemas comunes",
                "Un lugar donde se venden programas",
                "Una carpeta con imágenes",
                "El manual del sistema operativo"
            ),
            0,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué representa un dato de tipo 'Boolean'?",
            listOf(
                "Una palabra larga",
                "Un número negativo",
                "Un valor lógico de Verdadero o Falso",
                "Un carácter especial"
            ),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa 'Desplegar' o hacer 'Deploy' de un software?",
            listOf(
                "Imprimir su código fuente",
                "Poner la aplicación en producción o accesible para los usuarios finales",
                "Borrar la aplicación del servidor",
                "Cifrar la aplicación con contraseña"
            ),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué operador lógico representa habitualmente la conjunción 'Y' (AND)?",
            listOf("||", "!", "&&", "=="),
            2,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué operador lógico representa habitualmente la disyunción 'O' (OR)?",
            listOf("&&", "||", "!=", "++"),
            1,
            "Fácil",
            "Programación"
        ),
        Pregunta(
            "¿Qué carácter se usa comúnmente al final de una instrucción en lenguajes como C, Java o PHP?",
            listOf("Dos puntos (:)", "Punto y coma (;)", "Punto final (.)", "Coma (,)"),
            1,
            "Fácil",
            "Programación"
        ),

        // ==========================================
        // CATEGORÍA: PROGRAMACIÓN - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué paradigma de programación se basa fuertemente en 'Clases' y 'Objetos'?",
            listOf(
                "Programación Funcional",
                "Programación Lógica",
                "Programación Orientada a Objetos",
                "Programación Reactiva"
            ),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "En la Programación Orientada a Objetos, ¿qué es la 'Herencia'?",
            listOf(
                "Ocultar datos sensibles",
                "Una clase que adquiere los métodos y atributos de otra clase superior",
                "Crear múltiples instancias idénticas",
                "La eliminación de objetos inútiles"
            ),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué concepto de POO permite que diferentes objetos respondan de forma distinta a la misma llamada de método?",
            listOf("Herencia", "Abstracción", "Polimorfismo", "Encapsulamiento"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué técnica de POO se usa para proteger el estado interno de un objeto permitiendo su acceso solo a través de métodos controlados?",
            listOf("Polimorfismo", "Herencia", "Inyección", "Encapsulamiento"),
            3,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué método del protocolo HTTP se utiliza habitualmente para enviar datos al servidor y crear un recurso nuevo?",
            listOf("GET", "DELETE", "POST", "OPTIONS"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué formato de texto ligero es el estándar moderno más utilizado para el intercambio de datos estructurados entre cliente y servidor?",
            listOf("XML", "CSV", "JSON", "YAML"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué significan las siglas del patrón de arquitectura MVC?",
            listOf(
                "Model View Controller",
                "Main Virtual Core",
                "Memory Value Cache",
                "Multiple View Creation"
            ),
            0,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un 'Endpoint' en el contexto de una API REST?",
            listOf(
                "El puerto de la base de datos",
                "El archivo de configuración",
                "El último punto del código fuente",
                "Una URL específica donde la API recibe peticiones"
            ),
            3,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es el operador de 'igualdad estricta' en JavaScript (que comprueba valor y tipo)?",
            listOf("==", "===", "=", "!=="),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje clásico es famoso por introducir de forma intensiva el concepto y manejo manual de 'Punteros' a memoria?",
            listOf("Java", "Python", "C", "Ruby"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un 'Commit' en sistemas de control de versiones como Git?",
            listOf(
                "Una rama secundaria",
                "Una confirmación o captura local que guarda el estado actual de los archivos",
                "Un comando para borrar archivos",
                "La subida de datos al servidor remoto"
            ),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué estructura de datos opera bajo el principio FIFO (Primero en entrar, primero en salir)?",
            listOf("Pila", "Árbol", "Cola", "Grafo"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué técnica consiste en extraer datos de páginas web de forma automatizada simulando la navegación humana?",
            listOf("Web Scraping", "Phishing", "Inyección SQL", "Load Balancing"),
            0,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una 'Expresión Regular' (Regex)?",
            listOf(
                "Un tipo de función matemática",
                "Una secuencia de caracteres que define un patrón de búsqueda de texto avanzado",
                "Un error del compilador",
                "Una variable que no cambia de valor"
            ),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué entorno de ejecución multiplataforma permite a los desarrolladores utilizar JavaScript en el lado del servidor?",
            listOf("React", "Angular", "Node.js", "Django"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Cuál de estos famosos motores de bases de datos pertenece a la familia NoSQL (orientado a documentos)?",
            listOf("MySQL", "PostgreSQL", "MongoDB", "Oracle"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa 'Refactorizar' el código fuente?",
            listOf(
                "Cambiar el lenguaje en el que está escrito",
                "Reestructurar el código para hacerlo más limpio o eficiente sin alterar su comportamiento externo",
                "Borrar el código antiguo",
                "Copiar código de otro proyecto"
            ),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué palabra reservada se utiliza comúnmente en lenguajes como Java o C# para instanciar (crear) un nuevo objeto?",
            listOf("create", "new", "init", "build"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "En Git, ¿qué comando se utiliza para fusionar el trabajo de dos ramas diferentes?",
            listOf("git merge", "git push", "git clone", "git commit"),
            0,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué herramienta o técnica esconde la complejidad de las bases de datos relacionales mapeando tablas a objetos del código?",
            listOf("CDN", "API", "IDE", "ORM"),
            3,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué famoso error ocurre al intentar acceder a propiedades de un objeto que no apunta a ninguna dirección de memoria o valor?",
            listOf("Syntax Error", "NullPointerException", "IndexOutOfBounds", "StackOverflow"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿En qué lenguaje de bajo nivel está escrito principalmente el núcleo operativo de Linux?",
            listOf("Python", "C", "C++", "Ensamblador puro"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué popular y robusto framework para desarrollo web backend está basado en Python?",
            listOf("Laravel", "Spring Boot", "Django", "Express"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa que una operación en programación sea 'Asíncrona'?",
            listOf(
                "Que funciona sin internet",
                "Que el código no bloquea la ejecución del hilo principal mientras espera una respuesta",
                "Que requiere un reloj interno",
                "Que falla de forma aleatoria"
            ),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un 'Callback' en programación?",
            listOf(
                "Una función que llama a un servidor",
                "Un error de llamada",
                "Una función que se pasa como argumento a otra función para ser ejecutada después",
                "Un botón de retroceso"
            ),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué comando de Git se utiliza para copiar un repositorio remoto entero a tu máquina local por primera vez?",
            listOf("git push", "git status", "git clone", "git fetch"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué puerto de red utiliza el motor de base de datos MySQL por defecto?",
            listOf("80", "5432", "27017", "3306"),
            3,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué estilo de arquitectura de software divide una aplicación monolítica en servicios muy pequeños e independientes que se comunican por red?",
            listOf("Microservicios", "MVC", "Arquitectura en capas", "Peer-to-Peer"),
            0,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué popular plataforma se utiliza para aislar, empaquetar y ejecutar aplicaciones mediante el uso de contenedores?",
            listOf("Kubernetes", "Docker", "Git", "Jenkins"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje desarrollado por JetBrains se considera el sucesor moderno y oficial de Java para Android?",
            listOf("Swift", "Dart", "Kotlin", "Go"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es 'TypeScript'?",
            listOf(
                "Un framework de CSS",
                "Un sistema operativo",
                "Un superconjunto de JavaScript que añade tipado estático opcional",
                "Un editor de código"
            ),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una variable de ámbito 'Global'?",
            listOf(
                "Una variable que puede ser leída y modificada desde cualquier parte del programa",
                "Una variable que se guarda en la nube",
                "Una variable que solo acepta números",
                "Una variable temporal"
            ),
            0,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué significa que un lenguaje sea 'fuertemente tipado'?",
            listOf(
                "Que las variables no pueden cambiar de valor",
                "Que es muy difícil de aprender",
                "Que impone reglas estrictas y no permite mezclar o convertir implícitamente tipos incompatibles",
                "Que se escribe con letras mayúsculas"
            ),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué bloque de código se utiliza estándarmente para capturar y manejar errores o excepciones en tiempo de ejecución?",
            listOf("if-else", "while-do", "try-catch", "switch-case"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué instrucción SQL vacía una tabla rápidamente sin borrar su estructura, reseteando contadores de identidad?",
            listOf("DROP", "DELETE", "REMOVE", "TRUNCATE"),
            3,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué patrón creacional asegura que una clase tenga únicamente una instancia y proporciona un punto global de acceso a ella?",
            listOf("Factory", "Observer", "Singleton", "Decorator"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje de programación creó Apple en 2014 para reemplazar paulatinamente a Objective-C?",
            listOf("C#", "Swift", "Kotlin", "Rust"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué herramienta se usa comúnmente en ecosistemas Java para la gestión de dependencias y automatización de la construcción del proyecto?",
            listOf("NPM", "Maven", "Composer", "Pip"),
            1,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué comando SQL se utiliza para extraer datos específicos de una o varias tablas?",
            listOf("EXTRACT", "GET", "SELECT", "FETCH"),
            2,
            "Medio",
            "Programación"
        ),
        Pregunta(
            "¿Qué es un 'Bucle Infinito'?",
            listOf(
                "Un tipo de conexión Wi-Fi ininterrumpida",
                "Una estructura repetitiva que carece de una condición de salida funcional y bloquea el programa",
                "Una lista de datos inmensa",
                "Un comando del sistema operativo"
            ),
            1,
            "Medio",
            "Programación"
        ),

        // ==========================================
        // CATEGORÍA: PROGRAMACIÓN - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Cuál es la complejidad temporal (Big O) en el peor de los casos para el algoritmo de Búsqueda Binaria?",
            listOf("O(1)", "O(n)", "O(n^2)", "O(log n)"),
            3,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué principio SOLID dicta que las entidades de software deben estar abiertas a extensión, pero cerradas a modificación?",
            listOf(
                "Single Responsibility Principle",
                "Open/Closed Principle",
                "Liskov Substitution",
                "Dependency Inversion"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En lenguajes como JavaScript, ¿qué es un 'Closure' (Clausura)?",
            listOf(
                "Una instrucción que cierra la base de datos",
                "Una función que recuerda y tiene acceso a las variables de su entorno léxico donde fue creada",
                "Una función que no retorna valores",
                "Un bloque final de un if-else"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En programación concurrente, ¿qué describe el término 'Deadlock' (Interbloqueo)?",
            listOf(
                "Un apagón del sistema",
                "Un bucle infinito recursivo",
                "Una situación donde dos o más hilos esperan mutuamente por recursos bloqueados eternamente",
                "Un error de sintaxis del compilador"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es una 'Condición de Carrera' (Race Condition)?",
            listOf(
                "Un problema donde el resultado final depende del orden temporal incontrolable de ejecución de los hilos",
                "Un algoritmo que busca optimizar la velocidad del disco duro",
                "Un fallo en el ventilador de la CPU",
                "Una función que corre en menos de un milisegundo"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué función realiza el 'Garbage Collector' (Recolector de Basura) en entornos administrados?",
            listOf(
                "Limpiar los comentarios del código final",
                "Detectar y liberar de forma automática la memoria ocupada por objetos que ya no son referenciados",
                "Borrar archivos temporales de Windows",
                "Rechazar peticiones maliciosas"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué algoritmo de ordenamiento recursivo es muy rápido en el caso promedio (O(n log n)) pero degrada a O(n^2) si su pivote es deficiente?",
            listOf("Merge Sort", "Bubble Sort", "Quick Sort", "Insertion Sort"),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué patrón de comportamiento define una dependencia uno-a-muchos, donde múltiples objetos son notificados cuando cambia el estado de uno central?",
            listOf("Singleton", "Observer", "Strategy", "Factory"),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿En qué consiste el principio de Inversión de Dependencias (la letra D en SOLID)?",
            listOf(
                "Depender siempre de código externo",
                "Las clases deben depender de otras clases concretas",
                "Los módulos de alto nivel no deben depender de los de bajo nivel, ambos deben depender de abstracciones",
                "Las dependencias deben instalarse inversamente"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es WebAssembly (Wasm)?",
            listOf(
                "Un editor de texto web",
                "Un framework para CSS",
                "Un formato de instrucciones binarias que permite ejecutar lenguajes de bajo nivel en navegadores a velocidad casi nativa",
                "Un motor de bases de datos"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es el rol principal del 'Event Loop' en la arquitectura de un solo hilo de Node.js/JavaScript?",
            listOf(
                "Cifrar contraseñas",
                "Manejar la interfaz de usuario en 3D",
                "Coordinar la ejecución asíncrona despachando operaciones de la cola de tareas al stack cuando está vacío",
                "Crear bucles for automáticos"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué diferencia fundamental existe entre un Mutex y un Semáforo en sistemas concurrentes?",
            listOf(
                "Un mutex posee el concepto de propiedad exclusivo de un hilo, el semáforo es un contador de señalización para múltiples hilos",
                "El mutex es hardware, el semáforo es software",
                "No hay diferencia real",
                "El mutex es mucho más lento"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué estructura de datos subyacente se emplea abrumadoramente en motores de bases de datos relacionales para optimizar la búsqueda en índices de disco?",
            listOf(
                "Listas enlazadas simples",
                "Árboles B / B-Trees",
                "Tablas Hash exclusivamente",
                "Pilas LIFO"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué establece el Teorema CAP para sistemas distribuidos?",
            listOf(
                "Que no se puede almacenar más de cierta capacidad de datos",
                "Que solo se pueden garantizar dos atributos entre Consistencia, Disponibilidad y Tolerancia a particiones",
                "Que toda transacción debe ser atómica y aislada",
                "Que el código debe ser C, Assembly o Python"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En el paradigma de la Programación Funcional, ¿qué define a una 'función pura'?",
            listOf(
                "Que no recibe argumentos",
                "Que es asíncrona",
                "Que siempre retorna el mismo resultado dados los mismos argumentos y carece de efectos secundarios",
                "Que no contiene ningún bucle interno"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué patrón arquitectónico, promovido por Robert C. Martin, separa dependencias en anillos concéntricos poniendo las entidades de negocio en el centro puro?",
            listOf(
                "Microservicios",
                "Arquitectura Limpia (Clean Architecture)",
                "MVC Monolítico",
                "Client-Server"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué estructura de datos permite insertar y recuperar elementos típicamente en O(1) mapeando claves a índices de un array mediante una función matemática?",
            listOf(
                "Árbol Binario",
                "Cola de Prioridad",
                "Tabla Hash (Hash Table)",
                "Lista Doblemente Enlazada"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En Git, ¿qué comando es preferido para mantener un historial lineal moviendo o 'reaplicando' los commits de una rama sobre la punta de otra?",
            listOf("git merge", "git pull", "git checkout", "git rebase"),
            3,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es el célebre problema de decisión demostrado por Alan Turing que establece que no hay algoritmo general para saber si un programa terminará o iterará infinitamente?",
            listOf(
                "Problema del Viajante",
                "Problema de la Parada (Halting Problem)",
                "P vs NP",
                "El Problema de los Filósofos"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En el diseño de una API REST, ¿qué significa que un método HTTP sea 'Idempotente'?",
            listOf(
                "Que no necesita autenticación",
                "Que no transfiere datos JSON",
                "Que procesar la misma petición una o múltiples veces deja al servidor en el mismo estado exacto",
                "Que es extremadamente rápido"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje de sistemas moderno, patrocinado inicialmente por Mozilla, se enfoca drásticamente en la seguridad de memoria concurrente mediante un sistema de 'Ownership' sin recolector de basura?",
            listOf("Go", "C++20", "Julia", "Rust"),
            3,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué técnica paradigmática permite a una función resolver problemas dividiéndolos en subproblemas llamándose a sí misma?",
            listOf("Concurrencia", "Abstracción", "Polimorfismo", "Recursividad"),
            3,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En concurrencia, ¿qué se entiende por 'Starvation' (Inanición)?",
            listOf(
                "Un sistema con poca memoria RAM",
                "Un hilo no puede progresar porque constantemente se le niega el acceso a los recursos necesarios frente a otros hilos",
                "Un ataque DDoS al servidor",
                "El cierre forzado de la base de datos"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué patrón de diseño estructural provee una interfaz simplificada y unificada de alto nivel para ocultar la complejidad de un subsistema completo?",
            listOf("Facade (Fachada)", "Adapter", "Proxy", "Decorator"),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué técnica de la programación funcional retrasa la ejecución de una expresión hasta que su valor es estrictamente requerido?",
            listOf(
                "Evaluación Perezosa (Lazy Evaluation)",
                "Mutabilidad",
                "Inyección de dependencias",
                "Inferencia de tipos"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué tecnología desarrollada por Facebook funciona como una alternativa a REST permitiendo al cliente solicitar de forma tipada solo los datos exactos que necesita?",
            listOf("SOAP", "GraphQL", "gRPC", "WebSockets"),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué condición catastrófica provoca habitualmente un error de 'Stack Overflow' en tiempo de ejecución?",
            listOf(
                "Abrir demasiadas pestañas en el navegador",
                "Guardar un archivo de texto inmenso en el disco duro",
                "Una recursión infinita o anidamiento de funciones que agota el límite de memoria asignado a la pila",
                "Variables globales mal declaradas"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "Desde la teoría de grafos, ¿cómo se define formalmente la estructura de datos llamada Árbol?",
            listOf(
                "Un grafo conexo, no dirigido y acíclico",
                "Un grafo fuertemente conectado",
                "Una matriz bidimensional dispersa",
                "Una cola circular doble"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué es Kubernetes?",
            listOf(
                "Una base de datos de grafos",
                "Un sistema open-source para la automatización del despliegue, escalado y manejo de aplicaciones en contenedores",
                "Un lenguaje de programación para IA",
                "Un protocolo de seguridad criptográfico"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué técnica de optimización almacena en una caché el resultado de funciones costosas y devuelve la respuesta almacenada cuando ocurren los mismos inputs?",
            listOf("Memoización", "Ofuscación", "Minificación", "Serialización"),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué propiedad del paradigma ACID asegura que una transacción en base de datos se ejecuta en su totalidad o no tiene ningún efecto absoluto?",
            listOf("Consistencia", "Aislamiento", "Durabilidad", "Atomicidad"),
            3,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué significan las siglas CI/CD en las prácticas modernas de desarrollo de software y DevOps?",
            listOf(
                "Continuous Integration / Continuous Deployment (Integración y Despliegue Continuos)",
                "Code Inspection / Code Delivery",
                "Compiled Instructions / Computed Data",
                "Cyber Intelligence / Cyber Defense"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En lenguajes como C++, ¿qué es fundamentalmente un Puntero Inteligente (Smart Pointer)?",
            listOf(
                "Una IA que programa sola",
                "Un puntero con acceso al kernel",
                "Un objeto envoltorio que gestiona automáticamente el ciclo de vida y desasignación de memoria dinámica (RAII)",
                "Un número aleatorio"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿En qué consiste el sistema de tipado conocido como 'Duck Typing'?",
            listOf(
                "El tipado debe declararse con antelación estricta",
                "Un objeto es válido para un contexto si cumple con los métodos y propiedades requeridas, sin importar de qué clase hereda",
                "Solo se admiten variables anónimas",
                "Se compila a lenguaje ensamblador"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es la complejidad temporal asintótica de acceder aleatoriamente a un elemento en un arreglo en memoria mediante su índice?",
            listOf("O(n)", "O(log n)", "O(1)", "O(n^2)"),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué patrón de diseño delega la responsabilidad de instanciación de objetos a subclases mediante una interfaz común de creación?",
            listOf("Factory Method", "Builder", "Singleton", "Prototype"),
            0,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿De qué tres secciones codificadas en Base64 se compone típicamente la estructura de un JSON Web Token (JWT)?",
            listOf(
                "Usuario, Rol y Expiración",
                "Token, Clave y Datos",
                "Header, Payload y Signature",
                "Request, Response y Status"
            ),
            2,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Cuál es el objetivo principal del patrón de diseño 'Decorator'?",
            listOf(
                "Crear la interfaz de usuario",
                "Añadir responsabilidades y funcionalidades adicionales a un objeto dinámicamente sin afectar a otros de la misma clase",
                "Restringir la creación de objetos",
                "Notificar de eventos al sistema operativo"
            ),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "¿Qué lenguaje funcional utiliza la robusta máquina virtual BEAM, destacando enormemente por su concurrencia masiva y sistemas en tiempo real tolerantes a fallos?",
            listOf("Haskell", "Erlang", "Clojure", "F#"),
            1,
            "Difícil",
            "Programación"
        ),
        Pregunta(
            "En arquitectura a nivel de bytes, ¿qué determina el ordenamiento de bytes conocido como 'Big Endian'?",
            listOf(
                "Que el byte más significativo se almacena en la dirección de memoria más baja (al principio)",
                "Que los datos se dividen en trozos grandes en la caché",
                "Que el sistema soporta archivos pesados",
                "Que no se utiliza punto flotante"
            ),
            0,
            "Difícil",
            "Programación"
        ),
        // ==========================================
        // CATEGORÍA: SEGURIDAD - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es un virus informático?",
            listOf(
                "Un componente de la placa base",
                "Un programa diseñado para causar daño o alterar el equipo",
                "Un error de conexión a internet",
                "Un sistema operativo antiguo"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál es la función principal de un Antivirus?",
            listOf(
                "Prevenir, detectar y eliminar software malicioso",
                "Acelerar la velocidad del procesador",
                "Conectar el equipo a internet",
                "Recuperar contraseñas olvidadas"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es recomendable hacer con las contraseñas de tus cuentas?",
            listOf(
                "Usar la misma para todas",
                "Usar tu fecha de nacimiento",
                "Compartirla solo con amigos",
                "Crear contraseñas largas, únicas y difíciles de adivinar"
            ),
            3,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Spam'?",
            listOf(
                "Un correo basura o no deseado",
                "Una red social",
                "Un tipo de cable de red",
                "Una actualización del sistema"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué indica el icono de un candado cerrado junto a la dirección de una página web?",
            listOf(
                "Que la conexión está cifrada y es segura",
                "Que la página está bloqueada",
                "Que necesitas pagar para entrar",
                "Que la página tiene un virus"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una copia de seguridad o 'Backup'?",
            listOf(
                "Un archivo oculto de Windows",
                "Un duplicado de tus datos guardado en otro lugar para evitar su pérdida",
                "Un virus que borra tus fotos",
                "Un programa para acelerar juegos"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Por qué es peligroso conectarse a redes Wi-Fi públicas abiertas sin contraseña?",
            listOf(
                "Porque consumen mucha batería",
                "Porque tu ordenador se vuelve lento",
                "Porque otras personas en la red podrían interceptar tus datos",
                "Porque la pantalla pierde brillo"
            ),
            2,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué debes hacer antes de levantarte y dejar tu ordenador en la oficina?",
            listOf(
                "Apagar el monitor",
                "Bloquear la sesión o pantalla",
                "Desconectar el teclado",
                "Cerrar todas las ventanas"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Phishing' a nivel básico?",
            listOf(
                "Un ataque donde se hacen pasar por una empresa de confianza para robarte datos",
                "Un error del disco duro",
                "Un antivirus gratuito",
                "Una forma de descargar películas"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Es seguro abrir un archivo adjunto de un correo de un remitente desconocido?",
            listOf(
                "Sí, si tienes Windows Defender",
                "No, podría contener software malicioso",
                "Sí, los correos siempre son seguros",
                "Solo si el archivo es un PDF"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué función cumple un 'Firewall' o Cortafuegos?",
            listOf(
                "Enfría el servidor",
                "Filtra el tráfico de red entrante y saliente por seguridad",
                "Repara discos duros rotos",
                "Aumenta la velocidad del Wi-Fi"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Por qué algunas personas tapan la cámara web de su portátil?",
            listOf(
                "Para que la pantalla se vea mejor",
                "Para evitar ser espiados si su equipo es hackeado",
                "Para ahorrar batería",
                "Para protegerla del polvo"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué debes hacer si encuentras un pendrive USB tirado en la calle?",
            listOf(
                "Conectarlo al ordenador para ver de quién es",
                "No conectarlo a tu equipo, podría contener malware",
                "Formatearlo inmediatamente",
                "Venderlo por internet"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es la autenticación de dos factores (2FA)?",
            listOf(
                "Usar dos antivirus a la vez",
                "Requerir dos formas distintas de identificación para acceder a una cuenta",
                "Escribir la contraseña dos veces",
                "Tener dos cuentas de usuario"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tipo de información NO deberías publicar nunca en redes sociales de forma pública?",
            listOf(
                "Tu comida favorita",
                "Fotos de paisajes",
                "Tus datos personales, dirección o pasaporte",
                "Reseñas de películas"
            ),
            2,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué hace un 'Hacker' malicioso?",
            listOf(
                "Repara ordenadores",
                "Busca y explota vulnerabilidades en sistemas informáticos para beneficio propio",
                "Crea videojuegos",
                "Instala redes Wi-Fi"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Es seguro descargar programas desde cualquier página web?",
            listOf(
                "Sí, si la página tiene colores bonitos",
                "No, solo debes descargar software de sitios oficiales y de confianza",
                "Sí, si el programa es gratis",
                "Sí, internet es completamente seguro"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un PIN?",
            listOf(
                "Un código numérico secreto para identificarse",
                "Un componente de la placa base",
                "Un tipo de cable de red",
                "Una marca de ordenadores"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tecnología usa tu huella dactilar o tu rostro para desbloquear el móvil?",
            listOf("Criptografía", "Biometría", "Telemetría", "Bluetooth"),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué ocurre si haces clic en un anuncio que dice 'Eres el visitante 1 millón, has ganado un iPhone'?",
            listOf(
                "Te envían el iPhone a casa",
                "Es probable que sea una estafa para robar tus datos o infectar tu equipo",
                "Se actualiza tu sistema operativo",
                "Ganas un premio en efectivo"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es la 'Ingeniería Social'?",
            listOf(
                "Manipular psicológicamente a las personas para que revelen información confidencial",
                "Construir redes sociales",
                "Un tipo de puente",
                "Programar en lenguajes sociales"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué hace el modo incógnito o navegación privada del navegador?",
            listOf(
                "Te hace invisible para el proveedor de internet",
                "Evita que se guarde el historial y las cookies en tu dispositivo local",
                "Cifra todas tus contraseñas",
                "Evita que te entren virus"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Por qué es importante mantener el sistema operativo actualizado?",
            listOf(
                "Para cambiar el fondo de pantalla",
                "Para que los juegos vayan más rápido",
                "Para corregir fallos de seguridad o vulnerabilidades descubiertas",
                "Para liberar espacio en el disco"
            ),
            2,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué son los permisos de una aplicación móvil?",
            listOf(
                "Los derechos que pide la app para acceder a partes del teléfono como la cámara o ubicación",
                "El precio de la aplicación",
                "Las reglas del juego",
                "El idioma en el que está programada"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un Adblocker?",
            listOf(
                "Un virus que muestra anuncios",
                "Una extensión que bloquea la publicidad en las páginas web",
                "Un programa para diseñar banners",
                "Un buscador de internet"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Keylogger' básico?",
            listOf(
                "Un tipo de teclado",
                "Un software malicioso que registra todas las teclas que pulsas",
                "Un programa para recuperar contraseñas",
                "Un antivirus"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Es seguro enviar los datos de tu tarjeta de crédito por correo electrónico?",
            listOf(
                "Sí, es el método más seguro",
                "Solo si se envía a un banco",
                "No, los correos pueden ser interceptados fácilmente",
                "Sí, si el correo es de Gmail"
            ),
            2,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Ciberacoso' o Cyberbullying?",
            listOf(
                "Un juego online",
                "El uso de medios digitales para acosar o intimidar a una persona",
                "Robar cuentas de internet",
                "Hackear una empresa"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un CAPTCHA?",
            listOf(
                "Un virus muy peligroso",
                "Una prueba diseñada para distinguir si el usuario es un humano o un bot",
                "Un tipo de contraseña",
                "Un protocolo de red"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué debes hacer si recibes un SMS de tu supuesto banco pidiendo tu contraseña urgente?",
            listOf(
                "Ignorarlo o contactar al banco por vías oficiales, suele ser un fraude",
                "Responder con la contraseña rápidamente",
                "Reenviar el mensaje a tus amigos",
                "Apagar el móvil"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una red Wi-Fi oculta?",
            listOf(
                "Una red que no transmite públicamente su nombre",
                "Una red que no usa electricidad",
                "Una red sin contraseña",
                "Una red que funciona sin router"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Por qué no es bueno usar '123456' como contraseña?",
            listOf(
                "Porque es demasiado corta",
                "Porque es una de las contraseñas más comunes y fáciles de adivinar del mundo",
                "Porque caduca muy rápido",
                "Porque los teclados modernos no tienen números"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Software Pirata'?",
            listOf(
                "Programas de temática naval",
                "Software original comprado en tienda",
                "Programas distribuidos ilegalmente sin pagar los derechos de autor",
                "Software creado en altamar"
            ),
            2,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Por qué el software pirata es un riesgo de seguridad?",
            listOf(
                "Porque caduca a los 30 días",
                "Porque suele venir modificado e infectado con malware oculto",
                "Porque consume mucho internet",
                "Porque rompe el monitor"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa 'Cerrar sesión' (Log out)?",
            listOf(
                "Apagar el ordenador",
                "Finalizar el acceso seguro a tu cuenta para que nadie más la use",
                "Borrar tu cuenta para siempre",
                "Minimizar la ventana"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Robo de Identidad'?",
            listOf(
                "Robar el DNI físico de alguien",
                "Apropiarse de los datos de otra persona para hacerse pasar por ella en internet",
                "Hackear una red Wi-Fi",
                "Descargar una foto de Google"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Troll' de internet?",
            listOf(
                "Una persona que busca provocar, molestar o generar conflictos en foros y redes sociales",
                "Un virus de los años 90",
                "Un moderador de foros",
                "Un experto en ciberseguridad"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una 'Cookie' de seguimiento?",
            listOf(
                "Un pequeño archivo guardado en tu navegador que rastrea tu comportamiento en la web",
                "Un postre informático",
                "Un virus que borra el disco duro",
                "Un antivirus de Google"
            ),
            0,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Es seguro descargar archivos adjuntos que terminan en '.exe' de correos extraños?",
            listOf(
                "Sí, son documentos de texto",
                "No, son archivos ejecutables y podrían instalar malware",
                "Sí, son inofensivos",
                "Solo si usas Mac"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es la 'Huella Digital' en internet?",
            listOf(
                "El sensor del móvil",
                "El rastro de datos y actividad que dejas al navegar por internet",
                "Una contraseña biométrica",
                "Un tipo de escáner"
            ),
            1,
            "Fácil",
            "Seguridad"
        ),

        // ==========================================
        // CATEGORÍA: SEGURIDAD - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué tipo de malware cifra los archivos del usuario y exige un pago para recuperarlos?",
            listOf("Spyware", "Troyano", "Ransomware", "Adware"),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa la sigla VPN?",
            listOf(
                "Virtual Public Node",
                "Virtual Private Network",
                "Visual Processing Network",
                "Variable Ping Number"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tipo de malware se oculta dentro de un programa aparentemente legítimo?",
            listOf("Ransomware", "Troyano", "Gusano", "Keylogger"),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué diferencia a un Gusano (Worm) de un Virus tradicional?",
            listOf(
                "El gusano no es peligroso",
                "El gusano puede propagarse por la red de forma autónoma sin intervención humana",
                "El gusano solo ataca móviles",
                "No hay diferencia"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Spear Phishing'?",
            listOf(
                "Un ataque masivo a millones de correos",
                "Un ataque de phishing altamente personalizado y dirigido a una víctima específica",
                "Un ataque físico a servidores",
                "Un tipo de cifrado"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque de 'Fuerza Bruta'?",
            listOf(
                "Destruir un servidor físicamente",
                "Saturar la red con tráfico",
                "Intentar adivinar una contraseña probando millones de combinaciones",
                "Robar una base de datos con un USB"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué protocolo de seguridad es el estándar actual para redes Wi-Fi domésticas seguras?",
            listOf("WEP", "WPA", "WPA3", "WPS"),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una 'Botnet'?",
            listOf(
                "Un programa de inteligencia artificial",
                "Una red de computadoras infectadas controladas a distancia por un atacante",
                "Un servidor de videojuegos",
                "Un grupo de hackers éticos"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque DDoS?",
            listOf(
                "Inyectar código SQL",
                "Robar contraseñas mediante engaños",
                "Denegación de servicio distribuida que satura un sistema con tráfico falso",
                "Cifrar archivos y pedir rescate"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál es la finalidad del cifrado de extremo a extremo (E2EE)?",
            listOf(
                "Que los mensajes viajen rápido",
                "Que solo el emisor y el receptor puedan leer los mensajes, excluyendo al proveedor del servicio",
                "Que nadie pueda hacer capturas de pantalla",
                "Que no se gaste batería"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el Spyware?",
            listOf(
                "Software que muestra mucha publicidad",
                "Software malicioso que recopila información del usuario sin su conocimiento",
                "Un programa para espiar cámaras de seguridad",
                "Un antivirus oculto"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Para qué se utiliza una 'DMZ' en redes corporativas?",
            listOf(
                "Para acelerar la conexión",
                "Para aislar los servicios expuestos a internet del resto de la red local privada",
                "Para instalar software pirata",
                "Para guardar las copias de seguridad"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Hacker de Sombrero Blanco' (White Hat)?",
            listOf(
                "Un cibercriminal",
                "Un profesional de la ciberseguridad que ataca sistemas con permiso para encontrar y reparar vulnerabilidades",
                "Un estafador",
                "El creador de un virus"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque 'Man-in-the-Middle' (MitM)?",
            listOf(
                "Cortar el cable de red por la mitad",
                "El atacante intercepta y posiblemente altera la comunicación entre dos partes en secreto",
                "Adivinar la contraseña del router",
                "Infectar un servidor web"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Spoofing' en ciberseguridad?",
            listOf(
                "Borrar las huellas tras un hackeo",
                "Crear copias de seguridad",
                "Falsificar una identidad (como una IP o correo) para hacerse pasar por una fuente de confianza",
                "Atacar con fuerza bruta"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué técnica de seguridad convierte los datos en un formato ilegible para quien no posea la clave de descifrado?",
            listOf("Compresión", "Cifrado", "Hashing", "Codificación"),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál de estos protocolos proporciona seguridad en las comunicaciones por internet (ej. HTTPS)?",
            listOf("FTP", "SMTP", "SSL/TLS", "SNMP"),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Adware'?",
            listOf(
                "Software que bloquea anuncios",
                "Malware diseñado para mostrar publicidad no deseada de forma masiva",
                "Un programa de diseño gráfico",
                "Un troyano bancario"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una vulnerabilidad de software?",
            listOf(
                "Un virus recién creado",
                "Una función muy pesada",
                "Un fallo o debilidad en el código que puede ser explotado por un atacante",
                "Un programa antiguo"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Exploit'?",
            listOf(
                "El pago de un ransomware",
                "Un antivirus potente",
                "Un fragmento de software o comando que aprovecha una vulnerabilidad específica",
                "Un tipo de conexión segura"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Para qué sirve el 'Filtrado MAC' en un router?",
            listOf(
                "Para bloquear virus",
                "Para acelerar internet",
                "Para permitir o denegar el acceso a la red basándose en la dirección física del dispositivo",
                "Para encriptar la conexión"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Pentesting' (Test de penetración)?",
            listOf(
                "Un análisis de sangre",
                "Una simulación de ciberataque autorizada para evaluar la seguridad de un sistema",
                "Probar la velocidad de internet",
                "Un ataque de denegación de servicio"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué hace un ataque de diccionario?",
            listOf(
                "Busca errores ortográficos",
                "Cifra los documentos de texto",
                "Intenta romper una contraseña probando palabras comunes de una lista predefinida",
                "Traduce el código fuente"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Rootkit'?",
            listOf(
                "Un programa que formatea el disco",
                "Un cable de red",
                "Malware diseñado para ocultarse profundamente en el sistema operativo y otorgar acceso privilegiado",
                "Una herramienta para recuperar archivos"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué asegura una firma digital en un documento?",
            listOf(
                "Que el documento tiene colores",
                "Que el documento está cifrado",
                "La autenticidad del autor y que el documento no ha sido alterado",
                "Que no tiene virus"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Honeypot' en ciberseguridad?",
            listOf(
                "Un servidor falso diseñado para atraer y monitorizar a los atacantes",
                "Una recompensa económica",
                "Un programa antivirus",
                "Una base de datos cifrada"
            ),
            0,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Vishing'?",
            listOf(
                "Phishing a través de videollamadas",
                "Un ataque DDoS",
                "Phishing realizado a través de llamadas telefónicas de voz",
                "Un tipo de virus de Windows"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el 'Smishing'?",
            listOf(
                "Romper un servidor a golpes",
                "Un tipo de malware",
                "Phishing realizado mediante mensajes de texto (SMS)",
                "Phishing en redes sociales"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué función tiene un Certificado Digital en una página web?",
            listOf(
                "Hacerla cargar más rápido",
                "Validar la identidad del sitio web y habilitar conexiones cifradas seguras",
                "Mejorar su diseño",
                "Almacenar bases de datos"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué regla de backup recomienda tener 3 copias, en 2 soportes distintos, y 1 fuera de las instalaciones?",
            listOf(
                "Regla de oro",
                "Regla 3-2-1",
                "Regla de redundancia",
                "Regla de seguridad extrema"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es el Sandboxing (Caja de arena)?",
            listOf(
                "Un juego de construcción",
                "Ejecutar programas sospechosos en un entorno aislado y seguro para observar su comportamiento",
                "Borrar un disco duro de forma segura",
                "Un ataque de inyección SQL"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un análisis 'Heurístico' en un antivirus?",
            listOf(
                "Buscar virus por su nombre exacto",
                "Actualizar la base de datos",
                "Detectar malware desconocido analizando si su comportamiento es sospechoso",
                "Analizar solo archivos grandes"
            ),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tipo de cifrado utiliza la misma clave tanto para cifrar como para descifrar la información?",
            listOf("Cifrado asimétrico", "Cifrado cuántico", "Cifrado hash", "Cifrado simétrico"),
            3,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una política de 'Zero Trust' (Confianza Cero)?",
            listOf(
                "No confiar en internet",
                "Asumir que ninguna conexión es segura por defecto y verificar siempre todo el tráfico y usuarios",
                "No usar ordenadores",
                "Borrar todas las contraseñas"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué puerto se utiliza para conexiones seguras por SSH?",
            listOf("Puerto 80", "Puerto 443", "Puerto 22", "Puerto 21"),
            2,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un Proxy?",
            listOf(
                "Un servidor que actúa como intermediario entre un cliente e internet",
                "Un tipo de virus",
                "Un cable de red rápido",
                "Un disco duro cifrado"
            ),
            0,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa 'Parchear' un sistema?",
            listOf(
                "Reiniciarlo de fábrica",
                "Aplicar una actualización de software diseñada para solucionar un fallo o vulnerabilidad",
                "Apagarlo bruscamente",
                "Conectarlo a otra red"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es la 'Ingeniería Inversa' (Reverse Engineering) en malware?",
            listOf(
                "Escribir el código al revés",
                "Desensamblar y analizar un programa para entender cómo funciona internamente",
                "Devolver el virus al atacante",
                "Formatear el sistema"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué función tiene el filtrado de contenido o Control Parental?",
            listOf(
                "Acelerar los juegos",
                "Restringir el acceso a sitios web inapropiados o peligrosos en una red",
                "Limpiar el teclado",
                "Cifrar las contraseñas"
            ),
            1,
            "Medio",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'Endpoint' en ciberseguridad corporativa?",
            listOf(
                "El cable del router",
                "La contraseña maestra",
                "El servidor de correos",
                "Cualquier dispositivo final conectado a la red, como un portátil o móvil"
            ),
            3,
            "Medio",
            "Seguridad"
        ),

        // ==========================================
        // CATEGORÍA: SEGURIDAD - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué ataque inyecta scripts maliciosos en páginas web vistas por otros usuarios?",
            listOf("Buffer Overflow", "SQL Injection", "XSS", "CSRF"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué algoritmo es ampliamente utilizado en la criptografía asimétrica moderna?",
            listOf("AES", "DES", "RSA", "MD5"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué función criptográfica de un solo sentido convierte datos en una cadena de longitud fija?",
            listOf("Cifrado Simétrico", "Codificación Base64", "Compresión ZIP", "Función Hash"),
            3,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque de 'Día Cero' (Zero-day)?",
            listOf(
                "Un ataque que borra todo el sistema a medianoche",
                "Un ataque que explota una vulnerabilidad recién descubierta para la que aún no existe parche",
                "Un ataque de fuerza bruta",
                "Un fallo eléctrico"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Para qué se añade un 'Salt' a las contraseñas antes de hacerles el hash?",
            listOf(
                "Para comprimir su tamaño",
                "Para defenderse contra ataques de tablas arcoíris y añadir aleatoriedad",
                "Para cumplir normativas antiguas",
                "Para enviarlas por correo de forma segura"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué vulnerabilidad ocurre cuando un programa intenta almacenar más datos en un bloque de memoria temporal de los que puede contener?",
            listOf("Cross-Site Scripting", "Race Condition", "SQL Injection", "Buffer Overflow"),
            3,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué ataque engaña al navegador para que ejecute acciones no deseadas en una aplicación web en la que el usuario ya está autenticado?",
            listOf("CSRF", "XSS", "MitM", "DDoS"),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál es la diferencia principal entre un IDS y un IPS?",
            listOf(
                "El IDS es hardware y el IPS es software",
                "El IDS solo detecta y alerta sobre amenazas, el IPS además bloquea y previene el ataque",
                "No hay diferencia",
                "El IPS cifra la red"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa la sigla AES en criptografía?",
            listOf(
                "Automatic Encryption System",
                "Anonymous Entry Shell",
                "Advanced Encryption Standard",
                "Asymmetric Encoded Security"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué estructura de datos criptográfica sustenta la tecnología Blockchain garantizando la inmutabilidad?",
            listOf("Árboles B", "Listas enlazadas simples", "Árboles de Merkle", "Tablas Hash"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué estándar se utiliza habitualmente para la autorización delegada, permitiendo a una aplicación acceder a datos en otro servicio sin revelar la contraseña?",
            listOf("SAML", "Kerberos", "OAuth 2.0", "OpenID"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué vulnerabilidad crítica permitió extraer memoria del kernel en muchos procesadores modernos alterando la ejecución especulativa?",
            listOf("WannaCry", "Heartbleed", "Meltdown / Spectre", "Log4Shell"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué técnica busca descubrir vulnerabilidades introduciendo grandes cantidades de datos aleatorios o malformados en las entradas de un programa?",
            listOf("Fuzzing", "Hashing", "Phishing", "Sniffing"),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué término describe el ocultamiento de información dentro de otros archivos aparentemente inofensivos (como una imagen o audio)?",
            listOf("Criptografía", "Esteganografía", "Obfuscación", "Codificación"),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa el concepto de 'Perfect Forward Secrecy' (PFS) en protocolos como TLS?",
            listOf(
                "Que las contraseñas nunca expiran",
                "Que el cifrado es indescifrable incluso por ordenadores cuánticos",
                "Que el compromiso de una clave privada a largo plazo no compromete las claves de sesión pasadas",
                "Que no se utilizan certificados digitales"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué componente es el responsable de gestionar y emitir certificados digitales en una infraestructura PKI?",
            listOf(
                "El Router Core",
                "La Autoridad de Certificación (CA)",
                "El Servidor DNS",
                "El Firewall WAF"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿En qué consiste una Inyección SQL?",
            listOf(
                "Interferir en las consultas que una aplicación hace a su base de datos introduciendo comandos SQL maliciosos",
                "Saturar un servidor de bases de datos con pings",
                "Robar discos duros físicos",
                "Cifrar las tablas de la base de datos"
            ),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué protocolo de autenticación de red basado en tickets se utiliza comúnmente en entornos Windows Active Directory?",
            listOf("RADIUS", "OAuth", "Kerberos", "LDAP"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa que un ransomware utilice la técnica de 'Doble Extorsión'?",
            listOf(
                "Que ataca dos ordenadores a la vez",
                "Que pide dos pagos diferentes en Bitcoin",
                "Que cifra los archivos y además amenaza con publicar datos robados si no se paga",
                "Que cifra los datos dos veces"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál de estos algoritmos de hash criptográfico se considera obsoleto e inseguro por su alta susceptibilidad a colisiones?",
            listOf("MD5", "SHA-256", "SHA-3", "Argon2"),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué herramienta es una solución centralizada (SIEM) para la recolección y análisis de registros de seguridad en tiempo real?",
            listOf("Nmap", "Wireshark", "Metasploit", "Splunk"),
            3,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué concepto matemático es la base del intercambio de claves Diffie-Hellman?",
            listOf(
                "Cálculo integral",
                "Logaritmos discretos en un cuerpo finito",
                "Factorización de números primos grandes",
                "Geometría fractal"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tipo de firewall se sitúa específicamente delante de aplicaciones web para protegerlas de ataques como XSS o inyecciones?",
            listOf("WAF", "Packet Filter", "Stateful Firewall", "UTM"),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es una vulnerabilidad 'Directory Traversal' (Path Traversal)?",
            listOf(
                "Una inyección de código SQL",
                "Un ataque DDoS",
                "Un exploit que permite acceder a archivos y directorios fuera del directorio raíz previsto en el servidor web",
                "Una desbordamiento de búfer"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué significa 'APT' en el contexto de amenazas de seguridad a nivel empresarial o gubernamental?",
            listOf(
                "Anti-Phishing Tool",
                "Automated Penetration Testing",
                "Advanced Persistent Threat",
                "Asymmetric Public Token"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Cuál es el propósito del protocolo DNSSEC?",
            listOf(
                "Cifrar el tráfico de navegación",
                "Evitar el spoofing o envenenamiento de caché DNS añadiendo firmas criptográficas a los registros",
                "Acelerar la resolución de nombres",
                "Bloquear páginas web"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿En criptografía de Curva Elíptica (ECC), qué ventaja principal ofrece frente a RSA?",
            listOf(
                "Es software libre",
                "No utiliza matemáticas complejas",
                "Ofrece el mismo nivel de seguridad con claves mucho más cortas, mejorando el rendimiento",
                "Es imposible de romper incluso teóricamente"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque Sybil en redes P2P o blockchain?",
            listOf(
                "Un ataque donde un nodo malicioso crea múltiples identidades falsas para ganar una influencia desproporcionada en la red",
                "Inyectar código en la cartera de criptomonedas",
                "Destruir el servidor central",
                "Adivinar la clave privada"
            ),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un ataque de canal lateral (Side-channel attack)?",
            listOf(
                "Entrar físicamente por la puerta trasera del edificio",
                "Atacar los routers secundarios",
                "Extraer secretos analizando la implementación física del sistema (consumo eléctrico, radiación, sonido, tiempos de CPU)",
                "Redirigir el tráfico web"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué regla de seguridad informática rige la asignación de permisos a los usuarios?",
            listOf(
                "Principio del menor privilegio (Least Privilege)",
                "Regla de acceso total",
                "Principio de redundancia",
                "Regla del administrador único"
            ),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué son las reglas YARA?",
            listOf(
                "Normas éticas para hackers",
                "Un framework para identificar y clasificar muestras de malware mediante descripciones de patrones",
                "Reglas del firewall de Windows",
                "Un algoritmo de cifrado asimétrico"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué indica la lista 'OWASP Top 10'?",
            listOf(
                "Los mejores hackers del mundo",
                "Los 10 lenguajes más seguros",
                "Los 10 antivirus más vendidos",
                "Las 10 vulnerabilidades de seguridad en aplicaciones web más críticas y comunes"
            ),
            3,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué vulnerabilidad explotó el famoso ransomware WannaCry a nivel mundial en 2017?",
            listOf("Heartbleed", "EternalBlue", "Log4Shell", "Spectre"),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un 'C2' (Command and Control) en el contexto del malware?",
            listOf(
                "El teclado del atacante",
                "Un antivirus avanzado",
                "Un servidor que controla una botnet enviando instrucciones a los equipos infectados",
                "El núcleo del sistema operativo"
            ),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué técnica defensiva asigna un espacio de memoria aleatorio a procesos clave del sistema operativo para dificultar los ataques de desbordamiento de búfer?",
            listOf("ASLR", "DEP", "Sandboxing", "Hashing"),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué término describe el proceso de ocultar el propósito y la lógica del código fuente para dificultar la ingeniería inversa?",
            listOf("Transpilación", "Minificación", "Obfuscación", "Cifrado"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué componente de seguridad se encarga de analizar los paquetes a nivel de red para decidir si se permiten o bloquean según reglas de puertos e IPs?",
            listOf("Antivirus", "IPS", "Firewall", "Proxy Inverso"),
            2,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué tipo de ataque intercepta el saludo de autenticación y lo retransmite posteriormente para obtener acceso no autorizado?",
            listOf(
                "Ataque de Replay",
                "Ataque de Diccionario",
                "Ataque de Fuerza Bruta",
                "Ataque MitM"
            ),
            0,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "En el contexto de contraseñas, ¿qué es 'Credential Stuffing'?",
            listOf(
                "Llenar un formulario con datos falsos",
                "Atacar usando contraseñas filtradas previamente en otras brechas de seguridad asumiendo que el usuario repite credenciales",
                "Crear contraseñas muy largas",
                "Un ataque de denegación de servicio"
            ),
            1,
            "Difícil",
            "Seguridad"
        ),
        Pregunta(
            "¿Qué es un Payload en el contexto de un ciberataque?",
            listOf(
                "La parte del malware que ejecuta la acción maliciosa o destructiva",
                "El peso en megabytes del virus",
                "La herramienta para escanear la red",
                "La contraseña cifrada"
            ),
            0,
            "Difícil",
            "Seguridad"
        ),

        // ==========================================
        // CATEGORÍA: SOFTWARE - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es el Software?",
            listOf(
                "Las piezas físicas de la computadora",
                "El conjunto de programas, instrucciones y reglas informáticas",
                "El monitor y el teclado",
                "Un cable de red"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Cuál de los siguientes es un navegador web?",
            listOf("Microsoft Word", "Windows 10", "Adobe Photoshop", "Google Chrome"),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un Sistema Operativo?",
            listOf(
                "El software principal que gestiona el hardware y permite que otros programas funcionen",
                "Un programa para escribir textos",
                "Un antivirus",
                "Un juego de ordenador"
            ),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué empresa creó el sistema operativo Windows?",
            listOf("Apple", "Google", "IBM", "Microsoft"),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es una 'Aplicación' o 'App'?",
            listOf(
                "Un tipo de memoria RAM",
                "Una placa electrónica",
                "Un programa diseñado para realizar una tarea o función específica para el usuario",
                "Un cable del ordenador"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa 'Instalar' un programa?",
            listOf(
                "Borrarlo del disco duro",
                "Descargarlo pero no usarlo",
                "Copiar y configurar los archivos del programa en el sistema para que pueda ser utilizado",
                "Subirlo a internet"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Cuál es el programa principal para leer documentos en formato PDF?",
            listOf("Microsoft Excel", "Adobe Acrobat Reader", "Bloc de notas", "Google Chrome"),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué navegador web viene instalado por defecto en los dispositivos de Apple (Mac y iPhone)?",
            listOf("Firefox", "Edge", "Safari", "Opera"),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión de archivo se asocia típicamente a un documento de texto simple?",
            listOf(".jpg", ".exe", ".txt", ".mp4"),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa 'Desinstalar' un software?",
            listOf(
                "Cerrar la ventana del programa",
                "Apagar el ordenador",
                "Pausar la descarga",
                "Eliminar completamente el programa y sus archivos del sistema"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de programa es Microsoft Word?",
            listOf(
                "Un editor de imágenes",
                "Un navegador web",
                "Un sistema operativo",
                "Un procesador de textos"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Cuál de las siguientes extensiones corresponde a un archivo de música o audio?",
            listOf(".mp3", ".doc", ".png", ".exe"),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué función tiene un programa de tipo 'Antivirus'?",
            listOf(
                "Acelerar la conexión a internet",
                "Mejorar la resolución de la pantalla",
                "Proteger, detectar y eliminar software malicioso del equipo",
                "Escribir código de programación"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión '.exe' en Windows?",
            listOf(
                "Un documento de Word",
                "Un archivo de sistema de Apple",
                "Una foto de alta calidad",
                "Un archivo ejecutable (un programa)"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué popular software se utiliza masivamente para la edición profesional de imágenes y fotografías?",
            listOf("Microsoft Paint", "Adobe Photoshop", "VLC Media Player", "Notepad"),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa 'Actualizar' un software?",
            listOf(
                "Cambiarle el nombre al archivo",
                "Instalar una versión más reciente para añadir funciones o corregir errores",
                "Borrarlo temporalmente",
                "Hacer una copia de seguridad"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Freeware'?",
            listOf(
                "Software que requiere suscripción",
                "Software que es completamente gratuito para el usuario",
                "Software que daña el equipo",
                "Software de código abierto"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué programa es mundialmente conocido por su capacidad de reproducir casi cualquier formato de vídeo o audio (cuyo icono es un cono naranja)?",
            listOf("Windows Media Player", "iTunes", "QuickTime", "VLC Media Player"),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de software es Microsoft Excel?",
            listOf(
                "Un procesador de texto",
                "Un editor de vídeo",
                "Un sistema gestor de bases de datos",
                "Una hoja de cálculo"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Escritorio' (Desktop) en el contexto del software?",
            listOf(
                "La mesa donde pones el monitor",
                "El menú de configuración",
                "La pantalla principal de la interfaz gráfica donde se colocan iconos y accesos directos",
                "Un programa para dibujar"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué empresa desarrolla el sistema operativo Android?",
            listOf("Microsoft", "Apple", "Samsung", "Google"),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué función principal tiene el software 'WinRAR' o '7-Zip'?",
            listOf(
                "Editar fotos",
                "Comprimir y descomprimir archivos para que ocupen menos espacio",
                "Proteger contra virus",
                "Navegar por internet"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión se asocia comúnmente a un archivo de imagen estática?",
            listOf(".pdf", ".mp4", ".jpg", ".doc"),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión se asocia a un archivo de video?",
            listOf(".mp4", ".mp3", ".png", ".txt"),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un 'Buscador' dentro de un navegador web?",
            listOf(
                "La barra superior del programa",
                "La herramienta para encontrar archivos locales",
                "Un sitio web diseñado para buscar información en internet (ej. Google)",
                "Un antivirus"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de programa se utiliza para ver páginas web?",
            listOf("Navegador", "Procesador de textos", "Compilador", "Antivirus"),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa que un programa esté 'colgado' o 'congelado'?",
            listOf(
                "Que está subido a la nube",
                "Que está funcionando muy rápido",
                "Que es una versión antigua",
                "Que ha dejado de responder y no se puede interactuar con él"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Cómo se llama al proceso de apagar y volver a encender el sistema operativo?",
            listOf("Formatear", "Instalar", "Reiniciar", "Suspender"),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es una 'Interfaz Gráfica de Usuario' (GUI)?",
            listOf(
                "El diseño visual con iconos y ventanas que permite al usuario interactuar con el sistema",
                "El teclado y el ratón",
                "La tarjeta gráfica de la PC",
                "Un programa para diseñar juegos"
            ),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué tienda de aplicaciones es oficial para los dispositivos móviles de Apple?",
            listOf("Google Play Store", "Microsoft Store", "App Store", "Amazon Appstore"),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué tienda de aplicaciones es oficial para los dispositivos móviles con Android?",
            listOf("Google Play Store", "App Store", "Samsung Galaxy Store", "Windows Store"),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa poner el ordenador en 'Suspensión' (Sleep mode)?",
            listOf(
                "Ponerlo en un estado de bajo consumo de energía manteniendo la sesión abierta en la memoria RAM",
                "Apagarlo completamente",
                "Borrar todos los datos",
                "Desconectar internet"
            ),
            0,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un 'Acceso directo' (Shortcut)?",
            listOf(
                "Un cable más corto",
                "Un programa para saltarse contraseñas",
                "Un error del sistema",
                "Un icono que sirve como enlace directo para abrir un archivo o programa alojado en otra ubicación"
            ),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Para qué se usa un programa de correo electrónico o cliente de email (como Outlook)?",
            listOf(
                "Para navegar por internet",
                "Para escribir código",
                "Para enviar, recibir y gestionar correos electrónicos",
                "Para hacer videollamadas"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué empresa es creadora de programas como Word, Excel y PowerPoint?",
            listOf("Google", "Adobe", "Apple", "Microsoft"),
            3,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué función principal tiene el 'Explorador de archivos' en Windows?",
            listOf(
                "Navegar por páginas web",
                "Gestionar y organizar los archivos y carpetas del disco duro",
                "Editar fotos",
                "Proteger contra virus"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Menú de Inicio' en Windows?",
            listOf(
                "El botón para encender el monitor",
                "El menú principal desde donde se accede a los programas, configuraciones y opciones de apagado",
                "La primera página web que se abre",
                "La ventana de bienvenida"
            ),
            1,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué pasa si borras un archivo en el ordenador por error?",
            listOf(
                "Se envía al escritorio",
                "Se manda a un servidor de Microsoft",
                "Normalmente va a la Papelera de reciclaje y se puede restaurar",
                "Se destruye permanentemente al instante"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un 'Sistema Operativo móvil'?",
            listOf(
                "Un ordenador con ruedas",
                "Un portátil muy ligero",
                "Un sistema operativo diseñado específicamente para teléfonos inteligentes y tablets",
                "Un programa para hacer llamadas"
            ),
            2,
            "Fácil",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Spotify'?",
            listOf(
                "Un navegador web",
                "Un servicio de software para reproducir música en streaming",
                "Un programa de edición de vídeo",
                "Un antivirus"
            ),
            1,
            "Fácil",
            "Software"
        ),

        // ==========================================
        // CATEGORÍA: SOFTWARE - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué significa que un software sea 'Open Source' (Código Abierto)?",
            listOf(
                "Que no tiene contraseña",
                "Que su código fuente está disponible públicamente para ser estudiado, modificado y distribuido",
                "Que es obligatorio pagar una licencia",
                "Que solo funciona si hay internet"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es el modelo SaaS (Software as a Service)?",
            listOf(
                "Software almacenado en CDs",
                "Un modelo de distribución donde el software se aloja en servidores en la nube y se accede a través de internet, normalmente por suscripción",
                "Software diseñado para programadores",
                "Un tipo de sistema operativo"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es una Máquina Virtual (VM)?",
            listOf(
                "Un robot físico",
                "Una tarjeta gráfica externa",
                "Un tipo de procesador",
                "Un software que emula el funcionamiento de un ordenador físico completo dentro de otro sistema operativo"
            ),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué formato de archivo de imagen soporta transparencia y es muy usado en diseño web?",
            listOf(".jpg", ".png", ".bmp", ".avi"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de programa es 'Linux'?",
            listOf(
                "Un navegador web",
                "Un procesador de textos",
                "Un Sistema Operativo",
                "Un motor de bases de datos"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es un controlador o 'Driver' en informática?",
            listOf(
                "El usuario del ordenador",
                "Un programa de diseño gráfico",
                "Un software pequeño que permite que el sistema operativo se comunique y controle un hardware específico (como una impresora)",
                "Un tipo de cable USB"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Cuál es el núcleo (kernel) en el que se basa el sistema operativo Android?",
            listOf("Windows NT", "Linux", "macOS", "MS-DOS"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué empresa desarrolló y mantiene el formato de documento PDF?",
            listOf("Microsoft", "Google", "Apple", "Adobe"),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué herramienta se usa para ver el uso de CPU y memoria de los programas en Windows y poder forzar su cierre?",
            listOf(
                "Panel de Control",
                "Explorador de archivos",
                "Símbolo del sistema",
                "Administrador de Tareas"
            ),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Firmware'?",
            listOf(
                "Un software para editar texto",
                "Un antivirus de hardware",
                "Software grabado en una memoria de solo lectura que proporciona las instrucciones de bajo nivel de un hardware",
                "El exterior del ordenador"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué significa la extensión '.iso'?",
            listOf(
                "Un formato de archivo de audio de alta calidad",
                "Una imagen exacta o copia sector por sector de un disco óptico (como un CD o DVD)",
                "Un archivo de texto de sistema",
                "Una foto comprimida"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Shareware'?",
            listOf(
                "Software de código abierto",
                "Software completamente gratuito",
                "Software que se distribuye gratis como prueba por tiempo o funciones limitadas, invitando a comprar la versión completa",
                "Software malicioso"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué comando o atajo de teclado se utiliza comúnmente para 'Pegar' un texto copiado?",
            listOf("Ctrl + P", "Ctrl + C", "Ctrl + X", "Ctrl + V"),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué comando o atajo se utiliza para 'Deshacer' la última acción?",
            listOf("Ctrl + Y", "Ctrl + Z", "Ctrl + D", "Ctrl + U"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de software es 'Ubuntu'?",
            listOf(
                "Un lenguaje de programación",
                "Una distribución del sistema operativo Linux",
                "Un navegador de internet",
                "Un antivirus"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Registro de Windows' (Windows Registry)?",
            listOf(
                "El historial de navegación",
                "La tienda de aplicaciones",
                "Una base de datos jerárquica centralizada que almacena configuraciones y opciones del sistema operativo y aplicaciones",
                "Un documento de texto con contraseñas"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué significa que un sistema operativo sea 'Multitarea'?",
            listOf(
                "Que funciona con varios teclados",
                "Que permite ejecutar y alternar entre múltiples programas o procesos aparentemente al mismo tiempo",
                "Que es gratis",
                "Que tiene muchas pantallas"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es un 'Plugin' o 'Extensión'?",
            listOf(
                "Un complemento de software que añade una función específica o mejora a un programa más grande (como un navegador)",
                "Un virus informático",
                "El cable de la corriente",
                "Un programa para desinstalar otros programas"
            ),
            0,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué significa la sigla 'GUI'?",
            listOf(
                "Global User Internet",
                "Graphical User Interface (Interfaz Gráfica de Usuario)",
                "General Utility Interface",
                "Game User Input"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué término se usa para una versión de software que aún está en fase de prueba y puede contener errores antes de su lanzamiento oficial?",
            listOf("Versión Final", "Versión Alfa o Beta", "Versión Demo", "Versión Pro"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión de archivo es típica de un script de procesamiento por lotes en Windows?",
            listOf(".sh", ".exe", ".bat", ".txt"),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Cuál de estos es un software especializado en la creación y gestión de presentaciones?",
            listOf("Microsoft Excel", "Adobe Premiere", "Microsoft PowerPoint", "Notepad++"),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué formato de compresión es nativo en casi todos los sistemas operativos modernos sin necesidad de instalar programas extra?",
            listOf(".rar", ".7z", ".tar", ".zip"),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es la 'Consola' o 'Terminal' en un sistema operativo?",
            listOf(
                "El teclado",
                "El procesador central",
                "El cable de alimentación",
                "Una interfaz de línea de comandos basada en texto para interactuar con el sistema"
            ),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Para qué se utiliza el software 'AutoCAD' principalmente?",
            listOf(
                "Para reproducir música",
                "Para programación web",
                "Para diseño asistido por computadora (dibujo técnico y modelado 3D)",
                "Para editar fotografías"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué tipo de programa es 'Git'?",
            listOf(
                "Un sistema de control de versiones de código fuente",
                "Un navegador web",
                "Un reproductor multimedia",
                "Un motor de bases de datos"
            ),
            0,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Bloatware'?",
            listOf(
                "Software útil preinstalado",
                "Software de seguridad",
                "Software que hincha el sistema, normalmente preinstalado por el fabricante, que consume recursos y rara vez se usa",
                "Software para edición de video"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Cuál es el propósito de la partición de recuperación en un disco duro?",
            listOf(
                "Guardar las fotos del usuario",
                "Hacer copias de seguridad diarias",
                "Acelerar el sistema",
                "Permitir restaurar el sistema operativo a su estado de fábrica en caso de fallo crítico"
            ),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'DirectX' en el entorno de Windows?",
            listOf(
                "Un conjunto de APIs multimedia necesarias principalmente para videojuegos y gráficos avanzados",
                "Un editor de texto avanzado",
                "Un antivirus integrado",
                "El navegador por defecto"
            ),
            0,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué diferencia principal hay entre las arquitecturas de software de 32 bits y 64 bits en cuanto a memoria RAM?",
            listOf(
                "No hay diferencia",
                "El de 32 bits soporta un máximo aproximado de 4 GB de RAM, el de 64 bits soporta capacidades inmensamente mayores",
                "El de 32 bits es para Mac y 64 bits para Windows",
                "El de 32 bits es más rápido"
            ),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué sistema operativo es conocido históricamente por su entorno seguro de línea de comandos, gran estabilidad y ser la base de servidores mundiales?",
            listOf("Windows", "macOS", "Android", "UNIX / Linux"),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué programa incluye Windows para realizar ediciones muy básicas de imágenes y dibujo?",
            listOf("Photoshop", "Paint", "Illustrator", "GIMP"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es el software 'Portable'?",
            listOf(
                "Software que se puede instalar en el móvil",
                "Software ligero",
                "Software diseñado para ejecutarse directamente sin necesidad de instalación en el sistema, ideal para llevar en un USB",
                "Software para portátiles"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué significan las licencias de software 'EULA'?",
            listOf(
                "End User License Agreement (Acuerdo de licencia de usuario final)",
                "European Union Law Application",
                "Enterprise User Local Access",
                "Electronic Utility Limit Agreement"
            ),
            0,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué función tiene un gestor de descargas?",
            listOf(
                "Subir archivos a la nube",
                "Aumentar la velocidad del internet contratado",
                "Organizar, pausar, reanudar y acelerar la transferencia de archivos desde internet",
                "Proteger contra virus"
            ),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué software de virtualización para uso en escritorio es uno de los más conocidos y gratuitos?",
            listOf("Adobe Reader", "Oracle VirtualBox", "Google Chrome", "Microsoft Office"),
            1,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué empresa está detrás de la distribución de Linux llamada 'Ubuntu'?",
            listOf("Red Hat", "Microsoft", "Canonical", "Google"),
            2,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión se utiliza para los paquetes de instalación de aplicaciones en el sistema operativo Android?",
            listOf(".exe", ".app", ".dmg", ".apk"),
            3,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué extensión se utiliza para los archivos de instalación estándar de Windows Installer?",
            listOf(".msi", ".dmg", ".pkg", ".sh"),
            0,
            "Medio",
            "Software"
        ),
        Pregunta(
            "¿Qué es un archivo de volcado de memoria (Crash Dump)?",
            listOf(
                "Un documento que explica un programa",
                "Un archivo creado automáticamente por el sistema tras un fallo grave que guarda el estado de la memoria para diagnosticar el error",
                "Un virus de red",
                "Una papelera de reciclaje extra"
            ),
            1,
            "Medio",
            "Software"
        ),

        // ==========================================
        // CATEGORÍA: SOFTWARE - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es 'Docker' en el ámbito de la ingeniería de software?",
            listOf(
                "Un editor de código o IDE",
                "Un motor de bases de datos",
                "Un sistema operativo para servidores físicos",
                "Una plataforma para crear, ejecutar y empaquetar aplicaciones en contenedores aislados"
            ),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Cuál es la función del proceso 'Explorer.exe' en Windows?",
            listOf(
                "Es el navegador de internet",
                "Gestionar la interfaz gráfica de usuario, como la barra de tareas, el escritorio y la navegación de archivos",
                "Es el antivirus integrado",
                "Comprobar errores en el disco"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué diferencia clave existe entre la emulación y la virtualización?",
            listOf(
                "La emulación imita la arquitectura de hardware por software, la virtualización comparte los recursos del hardware real de forma directa",
                "Son exactamente lo mismo",
                "La emulación es para redes y la virtualización para almacenamiento",
                "La virtualización es mucho más lenta"
            ),
            0,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué sistema de archivos es el estándar utilizado por defecto en las instalaciones modernas de Windows?",
            listOf("FAT32", "NTFS", "ext4", "exFAT"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué sistema de archivos es el más utilizado históricamente por las distribuciones de Linux para sus particiones principales?",
            listOf("NTFS", "HFS+", "APFS", "ext4"),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿En el ecosistema Apple, qué formato de imagen de disco es el estándar para la distribución e instalación de software en macOS?",
            listOf(".exe", ".dmg", ".apk", ".deb"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Middleware'?",
            listOf(
                "El punto medio de una película",
                "Hardware situado entre la red y el servidor",
                "Software que proporciona servicios de comunicación o integración entre distintas aplicaciones o componentes del sistema",
                "Un sistema operativo antiguo"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "En el modelo cliente-servidor, ¿qué realiza un 'Proxy Inverso' (Reverse Proxy)?",
            listOf(
                "Traduce código a otro lenguaje",
                "Oculta la IP del usuario final al navegar",
                "Acelera la tarjeta gráfica",
                "Se sitúa frente a los servidores web interceptando peticiones de los clientes para equilibrar carga o dar seguridad"
            ),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa la sigla 'API'?",
            listOf(
                "Advanced Processing Unit",
                "Application Programming Interface",
                "Automated Program Integration",
                "Artificial Programming Intelligence"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un entorno de ejecución 'Runtime'?",
            listOf(
                "Una función para medir el tiempo del procesador",
                "El subsistema y conjunto de bibliotecas que permiten ejecutar el código de un programa durante su funcionamiento",
                "El momento en el que el programa se cierra",
                "Un editor de texto"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué protocolo de red proporciona a una aplicación la resolución del reloj interno para la sincronización temporal?",
            listOf("FTP", "NTP", "SMTP", "SNMP"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es el estándar POSIX?",
            listOf(
                "Un lenguaje de programación visual",
                "Un protocolo de transferencia de archivos seguro",
                "Una marca de procesadores",
                "Un conjunto de normas IEEE para asegurar la compatibilidad entre diferentes sistemas operativos Unix/Linux"
            ),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué proceso o técnica se utiliza en compiladores para reducir el código repetitivo expandiendo macros antes de la compilación principal?",
            listOf("Enlazado (Linking)", "Análisis léxico", "Preprocesamiento", "Optimización"),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un hipervisor de 'Tipo 1' (Bare-metal)?",
            listOf(
                "Un sistema de monitoreo remoto",
                "Un hipervisor que se ejecuta como aplicación dentro de un sistema operativo",
                "Un hipervisor que se instala directamente sobre el hardware físico sin requerir un SO anfitrión",
                "Un antivirus de red"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿En entornos GNU/Linux, qué es el 'GRUB'?",
            listOf(
                "El administrador de paquetes",
                "El entorno de escritorio gráfico",
                "El gestor de arranque responsable de cargar el núcleo del sistema operativo en memoria",
                "El editor de texto predeterminado"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué significa 'Interbloqueo' (Deadlock) a nivel de sistema operativo?",
            listOf(
                "Un apagón repentino del sistema",
                "Un ataque de red avanzado",
                "Un error de compilación",
                "Una situación donde varios procesos quedan paralizados esperando indefinidamente recursos que retienen mutuamente"
            ),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es el 'Paging' (Paginación) en la gestión de memoria de un sistema operativo?",
            listOf(
                "Un fallo de lectura en el disco",
                "El envío de notificaciones al usuario",
                "Una técnica que divide la memoria en bloques de tamaño fijo para facilitar la asignación de memoria virtual al disco",
                "Un mecanismo de seguridad"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué diferencia al software 'Libre' (Free Software) del software simplemente 'Open Source'?",
            listOf(
                "Es lo mismo, solo cambia el idioma",
                "El software libre hace énfasis en consideraciones éticas sobre la libertad de uso, estudio, modificación y distribución, no solo en la disponibilidad técnica del código",
                "El software libre no se puede modificar",
                "El software open source cuesta dinero"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Kubernetes' en el ecosistema de despliegue de software?",
            listOf(
                "Una base de datos documental",
                "Un orquestador de contenedores que automatiza el despliegue, escalado y gestión de aplicaciones containerizadas",
                "Un lenguaje de programación",
                "Un sistema operativo para móviles"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué tecnología de Microsoft permite instalar y ejecutar un entorno Linux nativo completo directamente sobre Windows 10/11 sin máquina virtual tradicional?",
            listOf("Cygwin", "Hyper-V", "WSL (Windows Subsystem for Linux)", "PowerShell"),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un 'Daemon' en sistemas basados en UNIX?",
            listOf(
                "Un virus muy antiguo",
                "Un usuario con permisos de superadministrador",
                "Un programa en segundo plano que atiende peticiones o realiza tareas del sistema sin interacción directa del usuario",
                "Un tipo de partición de disco"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "En el contexto de arquitecturas de software, ¿qué caracteriza a un diseño 'Monolítico'?",
            listOf(
                "La aplicación se desglosa en cientos de servicios pequeños",
                "Solo funciona en servidores de una sola marca",
                "La aplicación es diseñada como un único bloque indivisible e interdependiente",
                "Está escrita en un solo lenguaje de programación"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué herramienta se usa de forma estándar en Linux para instalar, actualizar o eliminar paquetes y sus dependencias en distribuciones basadas en Debian/Ubuntu?",
            listOf("yum", "pacman", "rpm", "apt / apt-get"),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué son las DLLs (Dynamic-Link Libraries) en Windows?",
            listOf(
                "Documentos de texto con contraseñas",
                "Archivos de imagen del sistema",
                "Archivos que contienen código, datos y recursos compartidos que múltiples programas pueden usar simultáneamente",
                "Discos duros lógicos locales"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Cuál de estos entornos de escritorio NO pertenece al ecosistema Linux?",
            listOf("GNOME", "KDE Plasma", "XFCE", "Aero"),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué componente de software traduce un programa escrito en lenguaje de alto nivel a código máquina de forma global antes de su ejecución?",
            listOf("Ensamblador", "Compilador", "Intérprete", "Depurador"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué componente traduce y ejecuta el código línea a línea o instrucción a instrucción en tiempo real, en lugar de pre-traducirlo todo?",
            listOf("Compilador", "Intérprete", "Enlazador", "Preprocesador"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué término describe el software diseñado para interactuar directamente con un sensor físico, actuador o sistema de control industrial, a menudo operando en tiempo real?",
            listOf(
                "Software Empotrado (Embedded Software)",
                "Software de Aplicación",
                "Sistema Gestor de Base de Datos",
                "Software de Diseño Gráfico"
            ),
            0,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "En el núcleo de Windows NT, ¿qué diferencia al modo usuario (User Mode) del modo núcleo (Kernel Mode)?",
            listOf(
                "En el modo usuario corren los controladores críticos y en el modo núcleo los programas normales",
                "No hay diferencia",
                "El modo usuario tiene menos colores",
                "El modo usuario tiene acceso restringido a los recursos, mientras que el modo núcleo tiene acceso total y sin restricciones al hardware"
            ),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué herramienta estándar se utiliza en el desarrollo web para compilar o 'transpilar' código JavaScript de versiones modernas a versiones compatibles con navegadores antiguos?",
            listOf("Webpack", "Babel", "NPM", "ESLint"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión '.rpm'?",
            listOf(
                "Un archivo multimedia",
                "Un formato de compresión para Windows",
                "Un paquete de software para distribuciones Linux como Red Hat o Fedora",
                "Un script de base de datos"
            ),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué gestor de dependencias es la herramienta estándar principal utilizada por el ecosistema de Node.js?",
            listOf("Pip", "Composer", "Maven", "NPM (Node Package Manager)"),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿En qué modelo de ciclo de vida del software las fases se desarrollan de forma secuencial y rígida, sin retroceder a la anterior (Requisitos, Diseño, Implementación, etc.)?",
            listOf("Desarrollo Ágil", "Modelo en Cascada (Waterfall)", "Scrum", "Prototipado"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué framework multiplataforma basado en C++ es muy utilizado para desarrollar interfaces gráficas (GUI), especialmente en el entorno KDE?",
            listOf("GTK", "Win32", "Qt", "WPF"),
            2,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "En bases de datos, ¿qué motor relacional es conocido históricamente por el comando 'VACUUM' para reclamar el espacio de almacenamiento muerto?",
            listOf("MySQL", "PostgreSQL", "SQL Server", "Oracle DB"),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué tecnología de Microsoft subyace bajo la mayoría de sus frameworks modernos y proporciona un entorno de ejecución administrado (CLR)?",
            listOf(".NET", "Java Virtual Machine", "DirectX", "ActiveX"),
            0,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué es 'Vagrant' en el desarrollo de software?",
            listOf(
                "Un motor de juegos",
                "Una herramienta para construir y gestionar entornos de máquinas virtuales reproducibles y configurables mediante código",
                "Un antivirus de código abierto",
                "Un lenguaje para bases de datos"
            ),
            1,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué arquitectura de procesador está diseñada para ofrecer máxima compatibilidad de software de PC de legado, introduciendo extensiones de 64 bits en la base x86 original?",
            listOf("ARM64", "MIPS", "PowerPC", "x86-64 (o AMD64)"),
            3,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿Qué sistema de compilación y empaquetado utiliza habitualmente archivos llamados 'Makefile' para dirigir la construcción de programas en C/C++?",
            listOf("Make", "CMake", "Ant", "Gradle"),
            0,
            "Difícil",
            "Software"
        ),
        Pregunta(
            "¿En el sistema de archivos de Linux, ¿qué función cumple el directorio estándar '/etc'?",
            listOf(
                "Almacenar los archivos ejecutables de los usuarios",
                "Guardar la memoria virtual del sistema",
                "Almacenar los archivos de configuración del sistema y de los programas",
                "Montar discos duros externos"
            ),
            2,
            "Difícil",
            "Software"
        ),
        // ==========================================
        // CATEGORÍA: SISTEMAS OPERATIVOS - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Cuál es el sistema operativo para ordenadores de escritorio más utilizado en el mundo?",
            listOf("macOS", "Linux", "Windows", "Chrome OS"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué empresa desarrolla el sistema operativo macOS?",
            listOf("Microsoft", "Google", "Apple", "IBM"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo usan la mayoría de los teléfonos móviles que no son iPhone?",
            listOf("Windows Mobile", "Android", "Symbian", "BlackBerry OS"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la 'Barra de tareas' en Windows?",
            listOf(
                "Una barra en la parte inferior que muestra programas abiertos y el botón de Inicio",
                "Una herramienta para medir el internet",
                "El título de las ventanas",
                "Un antivirus"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cómo se llama la pantalla principal que ves al encender el ordenador tras poner tu contraseña?",
            listOf("El Explorador", "El Escritorio", "El Navegador", "El Panel de Control"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una 'Carpeta' (Folder) en un sistema operativo?",
            listOf(
                "Un tipo de archivo de música",
                "Un contenedor virtual donde se agrupan y organizan archivos",
                "Un programa para escribir textos",
                "Un virus informático"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace el botón con una 'X' en la esquina superior derecha de una ventana en Windows?",
            listOf(
                "Minimiza la ventana",
                "Maximiza la ventana",
                "Cierra el programa o la ventana",
                "Apaga el ordenador"
            ),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué significa 'Reiniciar' el equipo?",
            listOf(
                "Apagar el sistema operativo por completo y volver a encenderlo automáticamente",
                "Borrar todos los archivos del disco duro",
                "Suspender la sesión temporalmente",
                "Cerrar solo el navegador de internet"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la 'Papelera de reciclaje'?",
            listOf(
                "Un programa de limpieza de virus",
                "Un lugar donde se almacenan temporalmente los archivos eliminados antes de su borrado definitivo",
                "Una carpeta oculta de Windows",
                "Un servicio de internet"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo de teclado se usa habitualmente para abrir el 'Administrador de tareas' en Windows?",
            listOf("Ctrl + Shift + Esc", "Alt + F4", "Windows + D", "Ctrl + C"),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo utilizan los ordenadores fabricados por Apple?",
            listOf("Windows", "macOS", "Android", "Linux"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Icono' en el escritorio?",
            listOf(
                "Un pequeño gráfico que representa un archivo, carpeta o programa para acceder a él",
                "Un error del sistema",
                "Un tipo de contraseña",
                "Un cable del monitor"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sucede si arrastras un archivo dentro de una carpeta?",
            listOf(
                "El archivo se borra",
                "El archivo se copia o mueve al interior de esa carpeta",
                "Se abre el archivo",
                "Se cambia el nombre del archivo"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo se representa con el logo de un pingüino llamado Tux?",
            listOf("Windows", "macOS", "Linux", "Android"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace la combinación de teclas 'Alt + F4' en Windows?",
            listOf(
                "Abre el menú de inicio",
                "Copia un texto",
                "Cierra la ventana o programa activo",
                "Sube el volumen"
            ),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Para qué sirve el 'Panel de Control' o 'Configuración'?",
            listOf(
                "Para jugar a videojuegos integrados",
                "Para modificar los ajustes del sistema, redes, cuentas y hardware",
                "Para navegar por páginas web",
                "Para escribir documentos"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo está diseñado principalmente para iPhone?",
            listOf("Android", "iOS", "Windows Phone", "macOS"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una 'Ventana' (Window) en la interfaz gráfica?",
            listOf(
                "Un área rectangular de la pantalla donde se muestra la interfaz de un programa",
                "El cristal del monitor",
                "Un virus de publicidad",
                "Un acceso directo roto"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cómo se llama la acción de pulsar dos veces rápidamente el botón izquierdo del ratón?",
            listOf("Arrastrar", "Doble clic", "Clic derecho", "Scroll"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué información sueles ver en el 'Área de notificación' (esquina inferior derecha de Windows)?",
            listOf(
                "La hora, el volumen, la red y programas en segundo plano",
                "Solo el botón de apagar",
                "Las fotos del usuario",
                "El bloc de notas"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una 'Cuenta de Usuario'?",
            listOf(
                "Un pago mensual a Microsoft",
                "Un perfil que permite a una persona tener su propia configuración, archivos y permisos en el ordenador",
                "Un correo electrónico falso",
                "Un tipo de conexión Wi-Fi"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo de teclado oculta todas las ventanas y muestra directamente el escritorio en Windows?",
            listOf("Ctrl + Alt + Supr", "Windows + D", "Alt + Tab", "Ctrl + Z"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué significa poner un ordenador en modo 'Avión'?",
            listOf(
                "Que el ordenador se apaga",
                "Que se desactivan todas las conexiones inalámbricas (Wi-Fi, Bluetooth)",
                "Que los ventiladores giran al máximo",
                "Que la pantalla se pone en blanco y negro"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué programa incluye Windows por defecto para navegar por archivos y carpetas?",
            listOf(
                "Explorador de Archivos (File Explorer)",
                "Google Chrome",
                "Microsoft Word",
                "Administrador de Dispositivos"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál es el asistente virtual integrado en Windows 10 y Windows 11?",
            listOf("Siri", "Alexa", "Cortana", "Google Assistant"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál es el asistente virtual de los sistemas operativos de Apple (iOS y macOS)?",
            listOf("Cortana", "Siri", "Bixby", "Alexa"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace el atajo 'Alt + Tab' en Windows?",
            listOf(
                "Cierra la ventana activa",
                "Abre el menú de inicio",
                "Permite cambiar rápidamente entre las ventanas y programas abiertos",
                "Apaga el ordenador"
            ),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el fondo de pantalla o 'Wallpaper'?",
            listOf(
                "Una protección contra virus",
                "La imagen de fondo que decora el escritorio del sistema operativo",
                "El color del teclado",
                "Un archivo de texto oculto"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el 'Menú contextual'?",
            listOf(
                "El menú que aparece al hacer clic derecho con el ratón, mostrando opciones para el elemento seleccionado",
                "El menú de inicio",
                "La lista de programas instalados",
                "El menú de ayuda del teclado"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Para qué sirve la opción 'Minimizar' de una ventana?",
            listOf(
                "Para cerrarla definitivamente",
                "Para ocultarla de la pantalla manteniéndola abierta en la barra de tareas",
                "Para hacerla más grande",
                "Para borrar el programa"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Acceso directo'?",
            listOf(
                "Un enlace rápido hacia un archivo o programa que se encuentra en otra ubicación",
                "Un cable más corto",
                "Una contraseña maestra",
                "Un error del sistema"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo es conocido por ser de código abierto y muy utilizado por programadores?",
            listOf("Windows", "macOS", "Linux", "iOS"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Dónde se encuentra habitualmente el botón de 'Inicio' en Windows?",
            listOf(
                "Esquina superior derecha",
                "Esquina inferior izquierda (o en el centro en W11)",
                "En el centro exacto de la pantalla",
                "No existe"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué pasa si borras un archivo de la Papelera de reciclaje?",
            listOf(
                "Vuelve al escritorio",
                "Se envía por correo",
                "Se elimina permanentemente del disco duro (para el usuario normal)",
                "Se guarda en un pendrive"
            ),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es 'Windows Update'?",
            listOf(
                "Una nueva versión de Windows",
                "Un virus de Microsoft",
                "El servicio que descarga e instala actualizaciones de seguridad y mejoras para el sistema",
                "Un programa para escribir textos"
            ),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué forma tiene comúnmente el cursor del ratón en la pantalla?",
            listOf("Un cuadrado", "Una flecha", "Un círculo", "Una línea"),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué debes usar para buscar un programa instalado si no encuentras su icono?",
            listOf(
                "La barra o cuadro de búsqueda del sistema",
                "La papelera de reciclaje",
                "El botón de apagar",
                "El reloj de Windows"
            ),
            0,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo de teclado bloquea el ordenador y te pide la contraseña para volver a entrar?",
            listOf("Ctrl + B", "Alt + F4", "Windows + L", "Ctrl + Shift + Esc"),
            2,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la extensión de un archivo (como .txt o .jpg)?",
            listOf(
                "El tamaño que ocupa",
                "Unos caracteres al final del nombre que le dicen al sistema qué tipo de archivo es y con qué programa abrirlo",
                "La fecha en la que se creó",
                "El autor del archivo"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Sistema Operativo' en resumen?",
            listOf(
                "El programa de internet",
                "El software principal que hace de intermediario entre el hardware (piezas) y el usuario",
                "Un antivirus",
                "La placa base"
            ),
            1,
            "Fácil",
            "Sistemas Operativos"
        ),

        // ==========================================
        // CATEGORÍA: SISTEMAS OPERATIVOS - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué es el 'Símbolo del sistema' (CMD) en Windows?",
            listOf(
                "Un procesador de texto",
                "Una interfaz de línea de comandos para ejecutar instrucciones de texto en el sistema",
                "Un antivirus oculto",
                "Una herramienta de diseño gráfico"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema de archivos es el más común y recomendado al formatear un disco duro principal para Windows 10/11?",
            listOf("FAT32", "exFAT", "NTFS", "ext4"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una 'Partición' de disco?",
            listOf(
                "Una carpeta oculta",
                "Una división lógica de un disco duro físico, que el sistema operativo trata como si fueran discos separados",
                "Un error de lectura",
                "Un programa de compresión"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál es la diferencia entre suspender e hibernar en Windows?",
            listOf(
                "Ninguna, son iguales",
                "Suspender apaga la pantalla y hibernar apaga el teclado",
                "Suspender guarda el estado en la RAM (consume energía), hibernar lo guarda en el disco duro (puede desconectarse de la luz)",
                "Hibernar borra los datos temporales"
            ),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo abre el 'Explorador de Archivos' en Windows?",
            listOf("Windows + E", "Windows + R", "Ctrl + F", "Alt + E"),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Controlador' o 'Driver'?",
            listOf(
                "El usuario administrador",
                "Un software que permite al sistema operativo comunicarse y controlar un componente de hardware específico",
                "Un virus informático",
                "Una actualización de Windows"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es 'Ubuntu'?",
            listOf(
                "Un lenguaje de programación",
                "Una popular distribución del sistema operativo GNU/Linux basada en Debian",
                "Un antivirus gratuito",
                "Una aplicación de Apple"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué herramienta usarías en Windows para comprobar el espacio libre y el estado de tus discos duros?",
            listOf(
                "Símbolo del sistema",
                "Administración de discos / Explorador",
                "Administrador de tareas",
                "Visor de eventos"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Para qué sirve el 'Administrador de Tareas'?",
            listOf(
                "Para escribir código",
                "Para monitorear el rendimiento del PC, ver procesos activos y forzar el cierre de programas bloqueados",
                "Para desinstalar Windows",
                "Para actualizar la placa base"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el 'Modo Seguro' (Safe Mode) en Windows?",
            listOf(
                "Un modo de arranque de diagnóstico que inicia Windows solo con los controladores y servicios básicos esenciales",
                "Un antivirus",
                "Un modo para que los niños usen el ordenador",
                "Un sistema de cifrado de archivos"
            ),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué significa 'Formatear' un disco o memoria USB?",
            listOf(
                "Cambiarle la forma física",
                "Instalarle un antivirus",
                "Preparar el sistema de archivos borrando los datos existentes para que el SO pueda almacenar información nueva",
                "Crear una copia de seguridad"
            ),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el 'Registro' (Regedit) de Windows?",
            listOf(
                "Una carpeta de fotos",
                "Una base de datos jerárquica que almacena las configuraciones y opciones del sistema operativo y aplicaciones",
                "Un historial de páginas web",
                "Un programa de contabilidad"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando de red se utiliza en CMD para comprobar si hay conexión con otro equipo o servidor enviando paquetes?",
            listOf("ipconfig", "ping", "dir", "cd"),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué función tiene un usuario con privilegios de 'Administrador'?",
            listOf(
                "Tiene control total sobre el sistema, pudiendo instalar software y cambiar configuraciones críticas",
                "Solo puede navegar por internet",
                "No puede borrar ningún archivo",
                "Es un usuario invitado"
            ),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión '.bat' en Windows?",
            listOf(
                "Un archivo de imagen de murciélago",
                "Un script o archivo de procesamiento por lotes que ejecuta una serie de comandos de CMD",
                "Un archivo de sonido",
                "Una base de datos de Excel"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo está basado en la arquitectura de Unix y es el corazón de los ordenadores Mac?",
            listOf("Windows", "Chrome OS", "macOS", "MS-DOS"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la 'Memoria Virtual' o archivo de paginación en un SO?",
            listOf(
                "Un pendrive externo",
                "Espacio reservado en el disco duro que el SO usa como si fuera memoria RAM cuando la RAM física se llena",
                "La memoria de la tarjeta gráfica",
                "Una memoria en la nube"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál es el equivalente de la 'Papelera de reciclaje' en macOS?",
            listOf("Trash (Papelera)", "Basurero", "Delete Box", "Recycle Bin"),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando en la terminal de Linux se usa comúnmente para listar el contenido de un directorio?",
            listOf("dir", "list", "ls", "show"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo de teclado abre la ventana 'Ejecutar' en Windows?",
            listOf("Windows + R", "Windows + E", "Ctrl + R", "Alt + R"),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Proceso' en el contexto de un sistema operativo?",
            listOf(
                "Un cable del ordenador",
                "Un programa en ejecución en la memoria del ordenador",
                "El arranque del sistema",
                "La descarga de un archivo"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Para qué sirve el sistema de archivos FAT32?",
            listOf(
                "Para discos de más de 1000 TB",
                "Es un formato muy compatible usado en pendrives, pero con la limitación de no soportar archivos individuales de más de 4GB",
                "Para instalar Linux de forma nativa",
                "Para cifrar discos de red"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es 'Windows Defender'?",
            listOf(
                "Un juego de estrategia",
                "El antivirus y sistema de seguridad integrado por defecto en Windows",
                "Un cortafuegos de hardware",
                "Una actualización del sistema"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace la herramienta 'Desfragmentar y optimizar unidades' en discos duros HDD?",
            listOf(
                "Limpia la pantalla",
                "Acelera el internet",
                "Reorganiza los fragmentos de archivos en el disco para que estén juntos y el cabezal los lea más rápido",
                "Borra virus"
            ),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una 'Distribución' (Distro) de Linux?",
            listOf(
                "Una tienda de ordenadores",
                "Un sistema operativo completo que incluye el núcleo Linux junto con software adicional y un entorno gráfico",
                "Un tipo de partición",
                "Una marca de procesadores"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué tecla se suele presionar repetidamente justo al encender el PC para entrar a la BIOS/UEFI antes de que cargue Windows?",
            listOf("Barra espaciadora", "Supr (Delete) o F2", "Enter", "Alt"),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el 'Kernel' de un sistema operativo?",
            listOf(
                "El núcleo central que gestiona los recursos del hardware y permite la comunicación entre hardware y software",
                "La pantalla de inicio",
                "El antivirus principal",
                "El menú de inicio"
            ),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿En Linux, quién es el usuario 'root'?",
            listOf(
                "Un usuario bloqueado",
                "El superusuario o administrador que tiene permisos absolutos sobre todo el sistema",
                "El usuario invitado",
                "Un virus troyano"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué herramienta de Windows permite restaurar el sistema a un punto anterior en el tiempo si ocurre un error grave tras una actualización?",
            listOf(
                "Restaurar sistema (System Restore)",
                "Scandisk",
                "Formateo rápido",
                "Windows Update"
            ),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema operativo fue el antecesor directo de Windows basado en línea de comandos?",
            listOf("macOS", "Linux", "MS-DOS", "Unix"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando usarías en la terminal de Linux para cambiar a otro directorio?",
            listOf("dir", "move", "cd", "pwd"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es 'DirectX' y para qué se usa en Windows?",
            listOf(
                "Un navegador web",
                "Una colección de APIs enfocadas principalmente en tareas multimedia, gráficos 3D y videojuegos",
                "Un procesador de texto",
                "Un controlador de impresoras"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué ocurre si detienes el proceso 'explorer.exe' en el Administrador de tareas?",
            listOf(
                "El ordenador se apaga",
                "Se desconecta internet",
                "Desaparecen la barra de tareas, los iconos del escritorio y las ventanas de carpetas hasta que lo reinicies",
                "Se borran tus archivos"
            ),
            2,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el software 'VirtualBox'?",
            listOf(
                "Un juego de simulación",
                "Un programa que permite crear y ejecutar Máquinas Virtuales con otros sistemas operativos dentro de tu PC",
                "Una tienda de aplicaciones",
                "Un antivirus"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la herramienta 'Visor de eventos' (Event Viewer) en Windows?",
            listOf(
                "Un programa para ver fotos",
                "Un registro que guarda mensajes detallados sobre errores, advertencias y el funcionamiento interno del sistema",
                "Un calendario de citas",
                "Una herramienta para grabar la pantalla"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión '.iso'?",
            listOf(
                "Una imagen de disco exacta que contiene todo el sistema de archivos de un CD o DVD, muy usada para instalar SOs",
                "Un archivo de música en 3D",
                "Un documento cifrado",
                "Un formato de foto RAW"
            ),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué atajo de teclado en macOS equivale a 'Ctrl + C' en Windows?",
            listOf("Option + C", "Cmd (Command) + C", "Shift + C", "Alt + C"),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué herramienta en macOS se utiliza para realizar copias de seguridad automáticas del sistema?",
            listOf("Time Machine", "iCloud Sync", "MacBackup", "Finder History"),
            0,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué función tiene el UAC (Control de cuentas de usuario) en Windows?",
            listOf(
                "Navegar por internet de forma segura",
                "Mostrar un aviso en pantalla pidiendo permiso antes de que un programa realice cambios a nivel de administrador",
                "Cambiar la contraseña del WiFi",
                "Actualizar los drivers"
            ),
            1,
            "Medio",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema de archivos es propio de los ordenadores modernos de Apple (macOS)?",
            listOf("NTFS", "ext4", "APFS (Apple File System)", "FAT32"),
            2,
            "Medio",
            "Sistemas Operativos"
        ),

        // ==========================================
        // CATEGORÍA: SISTEMAS OPERATIVOS - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué arquitectura de núcleo utiliza el sistema operativo GNU/Linux?",
            listOf("Microkernel", "Núcleo híbrido", "Núcleo exokernel", "Núcleo monolítico"),
            3,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿En el contexto de gestión de procesos, qué es un 'Deadlock' (Interbloqueo)?",
            listOf(
                "Un apagado repentino del PC",
                "Una situación donde dos o más procesos quedan esperando indefinidamente a que los otros liberen recursos",
                "Un error del disco duro",
                "Un fallo de compilación"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Inodo' (inode) en los sistemas de archivos de Linux/Unix?",
            listOf(
                "Un usuario sin permisos",
                "Una partición de disco pequeña",
                "Una estructura de datos que almacena toda la información sobre un archivo (permisos, tamaño, fechas) excepto su nombre y contenido real",
                "Un proceso en segundo plano"
            ),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué algoritmo de planificación de la CPU asigna un pequeño tiempo fijo a cada proceso de forma circular?",
            listOf(
                "Round Robin",
                "First Come First Served (FCFS)",
                "Shortest Job First (SJF)",
                "Planificación por prioridad"
            ),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué significa 'Paginación' (Paging) en la gestión de memoria de un sistema operativo?",
            listOf(
                "Crear páginas web locales",
                "Dividir la memoria virtual en bloques de tamaño fijo llamados páginas para mapearlos en la memoria física",
                "Imprimir documentos en la cola",
                "Borrar archivos grandes"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es 'Swap' en un entorno Linux?",
            listOf(
                "Intercambiar archivos de red",
                "Una partición o archivo especial en el disco duro que se utiliza como extensión de la memoria RAM virtual",
                "Un editor de texto",
                "Un gestor de arranque"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Hipervisor de Tipo 1' (Bare-metal)?",
            listOf(
                "Un hipervisor que corre sobre un SO anfitrión como Windows",
                "Un hipervisor que se instala y ejecuta directamente sobre el hardware del servidor sin un SO subyacente",
                "Un antivirus de red",
                "Un protocolo de transferencia"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace el comando 'chmod' en la terminal de Linux?",
            listOf(
                "Cambia la contraseña del usuario root",
                "Cambia el propietario de un archivo",
                "Cambia los permisos de lectura, escritura y ejecución de un archivo o directorio",
                "Borra el directorio actual"
            ),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué representa el número '777' en el comando chmod de Linux?",
            listOf(
                "Bloqueo total del archivo",
                "Permisos de lectura, escritura y ejecución concedidos al propietario, grupo y otros (todos)",
                "Permiso de ejecución solo para el root",
                "Es un puerto de red"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál es la función principal de 'systemd' en las distribuciones modernas de Linux?",
            listOf(
                "Es un entorno gráfico de escritorio",
                "Es un navegador web en terminal",
                "Es el sistema base y gestor de servicios/demonios que inicializa el sistema tras arrancar el kernel",
                "Es un antivirus integrado"
            ),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "En Windows, ¿qué herramienta de línea de comandos más avanzada reemplaza en muchos entornos al clásico cmd y usa cmdlets?",
            listOf("Bash", "Terminal Unix", "PowerShell", "VBScript"),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué significa POSIX en el mundo de los sistemas operativos?",
            listOf(
                "Un tipo de archivo temporal",
                "Un sistema de archivos exclusivo de macOS",
                "Un puerto de red físico",
                "Un conjunto de estándares de IEEE diseñados para mantener la compatibilidad entre sistemas operativos Unix y similares"
            ),
            3,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando en Linux se utiliza para buscar una cadena de texto dentro de archivos?",
            listOf("find", "grep", "search", "locate"),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "En sistemas de archivos de Windows (NTFS), ¿qué son los ADS (Alternate Data Streams)?",
            listOf(
                "Bases de datos relacionales",
                "Un método de cifrado",
                "Copias de seguridad automáticas",
                "Una característica que permite asociar datos adicionales u ocultos a un archivo principal sin afectar su tamaño visible"
            ),
            3,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué archivo de configuración en Linux se utiliza para montar automáticamente particiones y discos al arrancar el sistema?",
            listOf("/etc/passwd", "/etc/fstab", "/etc/hosts", "/boot/grub.cfg"),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué técnica utilizan los sistemas operativos para prevenir que un proceso acceda a la memoria asignada a otro proceso?",
            listOf(
                "Virtualización de memoria espacial",
                "Paginación inversa",
                "Multihilo",
                "Protección de memoria (Memory Protection) mediante anillos de privilegio y tablas de páginas"
            ),
            3,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "En la arquitectura de Windows NT, ¿qué capa aísla los controladores de dispositivos de hardware para hacerlos independientes del procesador?",
            listOf(
                "HAL (Hardware Abstraction Layer)",
                "Win32 Subsystem",
                "User Mode",
                "Executive Services"
            ),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Hilo' (Thread) a diferencia de un 'Proceso'?",
            listOf(
                "Un proceso no tiene memoria, un hilo sí",
                "Un hilo es una unidad básica de uso de la CPU que comparte código y recursos con otros hilos del mismo proceso; un proceso tiene su propio espacio aislado",
                "Son exactamente lo mismo",
                "El hilo es para hardware y el proceso para software"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es un 'Demonio' (Daemon) en Unix/Linux?",
            listOf(
                "Un virus de boot sector",
                "Un programa que se ejecuta en segundo plano, sin terminal interactiva, para proporcionar servicios al sistema",
                "Un usuario con permisos de administrador revocados",
                "El proceso que cierra las ventanas"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando de Linux muestra los procesos del sistema en tiempo real y su consumo de recursos (similar al administrador de tareas de forma visual en terminal)?",
            listOf("ps", "kill", "top / htop", "df"),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace la orden 'sudo' en Linux?",
            listOf(
                "Cierra la sesión del usuario",
                "Permite a un usuario normal ejecutar comandos con privilegios de seguridad de otro usuario (por defecto root)",
                "Instala una actualización del sistema",
                "Borra el directorio raíz"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿En el registro de Windows, qué es una colmena (Hive)?",
            listOf(
                "Un virus detectado",
                "Una copia de seguridad antigua",
                "Un clúster de discos virtuales",
                "Un grupo lógico de claves, subclaves y valores que tiene un conjunto de archivos físicos correspondientes"
            ),
            3,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Cuál de estos sistemas operativos fue diseñado originalmente en los laboratorios Bell en los años 70 y sentó las bases de muchos sistemas modernos?",
            listOf("Windows 1.0", "Unix", "OS/2", "AmigaOS"),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué herramienta en Windows permite gestionar máquinas virtuales a nivel de sistema operativo y actúa como un hipervisor nativo Tipo 1?",
            listOf("VirtualBox", "VMware Workstation", "Hyper-V", "Windows Sandbox"),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué ocurre cuando un programa sufre un 'Segmentation Fault' (fallo de segmentación)?",
            listOf(
                "Intenta acceder a una dirección de memoria a la que no tiene permisos de acceso, y el SO lo detiene (crashea)",
                "Se queda sin disco duro",
                "Borra archivos de Windows",
                "El monitor se apaga"
            ),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema de archivos por defecto utiliza Windows Server 2012 y posteriores enfocado en alta resistencia, redundancia y autocuración de datos?",
            listOf("FAT16", "ReFS (Resilient File System)", "ext3", "NTFS-Z"),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando se utiliza en sistemas Linux para finalizar forzosamente un proceso usando su PID?",
            listOf("kill", "stop", "end", "close"),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el archivo 'hosts' presente tanto en Windows como en Linux?",
            listOf(
                "Un archivo que guarda las contraseñas del Wi-Fi",
                "Un archivo de texto local que mapea nombres de host o dominios web a direcciones IP, actuando antes que un servidor DNS",
                "Un registro de usuarios conectados",
                "Un script de arranque del sistema"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es la tecnología 'ASLR' utilizada por los sistemas operativos modernos?",
            listOf(
                "Address Space Layout Randomization, que aleatoriza las posiciones de memoria de procesos clave para evitar exploits de desbordamiento",
                "Un sistema de compresión de archivos de audio",
                "Un protocolo para redes locales",
                "Una técnica de renderizado 3D"
            ),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "En macOS, ¿qué es 'Darwin'?",
            listOf(
                "El entorno gráfico principal",
                "El núcleo Unix subyacente de código abierto sobre el cual se construye el resto de macOS",
                "El motor de renderizado de Safari",
                "El asistente virtual original"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es una llamada al sistema (System Call)?",
            listOf(
                "Un sonido de error de Windows",
                "El mecanismo utilizado por un programa de usuario para solicitar un servicio privilegiado al kernel del sistema operativo",
                "Una videollamada por internet",
                "El botón de apagado del hardware"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué herramienta de diagnóstico de Windows proporciona información hiperdetallada sobre el hardware, componentes del sistema y entorno de software (accesible ejecutando msinfo32)?",
            listOf(
                "Administrador de discos",
                "Información del sistema",
                "Monitor de recursos",
                "Visor de eventos"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿En qué consiste la técnica de 'Copy-On-Write' en gestión de memoria y sistemas de archivos?",
            listOf(
                "Un recurso compartido (como memoria) no se copia realmente hasta que uno de los procesos intenta modificarlo, ahorrando recursos",
                "Copiar todos los archivos antes de apagarse",
                "Escribir datos en un USB temporal",
                "Duplicar la RAM en el disco duro"
            ),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué comando en Windows PowerShell sirve para ver la lista de comandos disponibles (similar al man de Linux)?",
            listOf("Get-Help", "dir", "list-commands", "show-help"),
            0,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el 'Bootloader' o gestor de arranque?",
            listOf(
                "El ventilador del procesador",
                "El menú de configuración de Windows",
                "Un pequeño programa alojado en el sector de arranque que carga el sistema operativo en la memoria RAM al iniciar",
                "El antivirus de inicio"
            ),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué hace el comando 'ping 127.0.0.1'?",
            listOf(
                "Ataca a un servidor remoto",
                "Hace ping a la interfaz de red local (localhost) del propio equipo para verificar que el protocolo TCP/IP funciona correctamente",
                "Reinicia el router",
                "Apaga la conexión de red"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿En el contexto de los drivers en Windows, qué significa la firma digital de controladores (Driver Signature)?",
            listOf(
                "Que el driver fue pagado",
                "Una marca criptográfica que asegura que el controlador proviene del desarrollador oficial y no ha sido alterado maliciosamente",
                "Un logotipo en color en la interfaz",
                "Un archivo de texto adjunto"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué es el MBR (Master Boot Record) en particionado tradicional?",
            listOf(
                "Un sistema de archivos para CDs",
                "El primer sector físico de un disco duro que contiene la tabla de particiones y el código de inicio",
                "Un antivirus de disco",
                "El menú de arranque de Linux"
            ),
            1,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "¿Qué sistema de particiones moderno ha reemplazado mayoritariamente al MBR para soportar discos de más de 2 TB y arranque UEFI?",
            listOf("FAT32", "NTFS", "GPT (GUID Partition Table)", "ext4"),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),
        Pregunta(
            "En el comando de Linux 'tar -czvf archivo.tar.gz carpeta/', ¿qué indica la letra 'z'?",
            listOf(
                "Que no pida confirmación",
                "Que el archivo final estará oculto",
                "Que aplique compresión gzip al archivo empaquetado",
                "Que borre la carpeta original"
            ),
            2,
            "Difícil",
            "Sistemas Operativos"
        ),

        // ==========================================
        // CATEGORÍA: OFIMÁTICA - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué es Microsoft Word?",
            listOf(
                "Un navegador web",
                "Un programa para hacer presentaciones",
                "Un procesador de textos para crear y editar documentos",
                "Una hoja de cálculo"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Cuál es el programa más conocido de Microsoft para crear hojas de cálculo?",
            listOf("Access", "PowerPoint", "Excel", "Outlook"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué se utiliza principalmente Microsoft PowerPoint?",
            listOf(
                "Para escribir cartas formales",
                "Para diseñar bases de datos",
                "Para hacer videollamadas",
                "Para crear presentaciones visuales con diapositivas"
            ),
            3,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En un procesador de textos, ¿qué atajo de teclado se usa generalmente para 'Negrita' (en español)?",
            listOf("Ctrl + K", "Ctrl + S", "Ctrl + N", "Ctrl + C"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado se utiliza comúnmente en Word para 'Guardar' el documento?",
            listOf("Ctrl + G (o Ctrl + S en inglés)", "Ctrl + P", "Ctrl + Z", "Ctrl + A"),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿para qué sirve la opción 'Justificar' un texto?",
            listOf(
                "Para que el texto quede alineado uniformemente tanto al margen izquierdo como al derecho",
                "Para ponerlo en mayúsculas",
                "Para centrarlo en la página",
                "Para subrayarlo de rojo"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es una 'Celda' en Excel?",
            listOf(
                "La barra superior",
                "La intersección de una fila y una columna donde se introducen los datos",
                "El nombre del archivo",
                "Una fórmula matemática"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Cómo se identifica normalmente una celda en Excel?",
            listOf(
                "Con un número y una letra (ej. A1)",
                "Con un color",
                "Con un símbolo matemático",
                "Con el nombre del usuario"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué carácter debes poner al principio en Excel para iniciar una fórmula matemática?",
            listOf(
                "Un asterisco (*)",
                "Un símbolo de igual (=)",
                "Un signo de suma (+)",
                "Un porcentaje (%)"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =SUMA() en Excel?",
            listOf(
                "Multiplica los números",
                "Resta dos celdas",
                "Busca un texto",
                "Suma todos los valores numéricos dentro del rango seleccionado"
            ),
            3,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Cuál es la alternativa gratuita de Google a Microsoft Word?",
            listOf("Google Drive", "Google Docs (Documentos)", "Google Sheets", "Google Slides"),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué son los 'Márgenes' en un documento de Word?",
            listOf(
                "El color de la letra",
                "Los espacios en blanco alrededor de los bordes de la página donde no se escribe",
                "Las notas a pie de página",
                "Los títulos de los capítulos"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, ¿qué es una 'Diapositiva'?",
            listOf(
                "El tiempo que dura la presentación",
                "El efecto de cambio entre pantallas",
                "Una página o pantalla individual dentro de la presentación",
                "La ventana del programa"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado sirve para 'Deshacer' el último cambio si te equivocas?",
            listOf("Ctrl + Z", "Ctrl + Y", "Ctrl + P", "Ctrl + X"),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué se utiliza la herramienta 'Copiar formato' (el icono de la brocha) en Word?",
            listOf(
                "Para pintar dibujos en la página",
                "Para copiar el estilo visual (color, fuente) de un texto y aplicarlo a otro rápidamente",
                "Para borrar todo el documento",
                "Para buscar palabras con ese formato"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es la 'Fuente' o 'Tipografía' en un texto?",
            listOf(
                "El origen del documento",
                "El tamaño de la página",
                "El diseño o estilo de letra (ej. Arial, Times New Roman)",
                "El color de fondo"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado se usa universalmente para 'Imprimir' un documento?",
            listOf("Ctrl + I", "Ctrl + P", "Ctrl + PrtSc", "Ctrl + O"),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué representan las letras (A, B, C...) en la parte superior?",
            listOf("Las fórmulas", "Las filas", "Las columnas", "Las hojas del documento"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué representan los números (1, 2, 3...) en el lateral izquierdo?",
            listOf("Las celdas", "Las columnas", "Los estilos de letra", "Las filas"),
            3,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve el botón de 'Cursiva' (Italics)?",
            listOf(
                "Para poner el texto tachado",
                "Para inclinar ligeramente las letras hacia la derecha resaltando el texto",
                "Para cambiar el color de las letras",
                "Para hacer las letras más grandes"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un archivo PDF?",
            listOf(
                "Un documento que preserva el diseño y formato exacto para visualizarse igual en cualquier dispositivo",
                "Un formato de vídeo",
                "Una base de datos de Excel",
                "Un virus informático"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Puedes guardar un documento de Word directamente como PDF?",
            listOf(
                "No, necesitas un programa de pago",
                "Sí, usando la opción 'Guardar como' y eligiendo el formato PDF",
                "Solo si tienes internet",
                "Sí, pero se borran las imágenes"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, ¿qué es iniciar el 'Modo de presentación'?",
            listOf(
                "Hacer las letras más grandes",
                "Imprimir todas las diapositivas",
                "Ver las diapositivas a pantalla completa tal como las verá el público",
                "Ponerle música de fondo al programa"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué tecla se suele usar para iniciar una presentación de PowerPoint desde la primera diapositiva?",
            listOf("F1", "Enter", "F5", "Esc"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Cómo se llama la barra superior de Word donde están todas las herramientas, iconos y pestañas?",
            listOf(
                "Barra de navegación",
                "Cinta de opciones (Ribbon)",
                "Panel de control",
                "Menú de inicio"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve el 'Corrector ortográfico' integrado en Word?",
            listOf(
                "Para traducir el texto a otro idioma",
                "Para detectar palabras mal escritas y subrayarlas normalmente en rojo, ofreciendo correcciones",
                "Para borrar párrafos largos",
                "Para justificar el texto"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué significa la opción 'Interlineado' en Word?",
            listOf(
                "El color de las líneas",
                "La distancia o espacio vertical entre las líneas de un párrafo",
                "El margen de la página",
                "El número de caracteres por línea"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué hace el botón 'Autosuma' (símbolo Σ)?",
            listOf(
                "Calcula automáticamente la suma de un rango de celdas cercanas",
                "Multiplica todas las celdas",
                "Crea una gráfica",
                "Suma hojas de cálculo"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve la opción 'Buscar y Reemplazar'?",
            listOf(
                "Para buscar archivos en el PC",
                "Para encontrar una palabra en todo el documento y sustituirla automáticamente por otra",
                "Para buscar errores ortográficos",
                "Para buscar fotos en internet"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un 'Encabezado' en Word?",
            listOf(
                "El título más grande de la página",
                "El índice del documento",
                "Un área en el margen superior de la página cuyo contenido (ej. logos, títulos) se repite en todas las hojas",
                "La primera frase de un párrafo"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, si ves '#####' en una celda en lugar de un número, ¿qué significa?",
            listOf(
                "Que la columna es demasiado estrecha para mostrar el número completo",
                "Que la fórmula es errónea",
                "Que el ordenador tiene un virus",
                "Que el texto está cifrado"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un 'Gráfico circular' (o de tarta) en Excel o PowerPoint?",
            listOf(
                "Un gráfico que muestra proporciones y porcentajes de un total dividiendo un círculo en porciones",
                "Un texto en forma de círculo",
                "Una animación de PowerPoint",
                "Un círculo que da vueltas mientras carga"
            ),
            0,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, ¿qué es un 'Diseño de diapositiva'?",
            listOf(
                "El color de la pared de fondo",
                "Una plantilla predefinida que organiza los cuadros de texto, títulos e imágenes en posiciones específicas",
                "El número de la diapositiva",
                "Un tipo de transición"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué programa de la suite de Microsoft Office se utiliza principalmente para gestionar correos electrónicos y calendarios?",
            listOf("Word", "OneNote", "Outlook", "Access"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =PROMEDIO() en Excel?",
            listOf(
                "Busca el valor más alto",
                "Calcula la media aritmética de los números seleccionados",
                "Suma los valores y los multiplica",
                "Cuenta las celdas vacías"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado te permite 'Cortar' un texto (quitarlo de un sitio para pegarlo en otro)?",
            listOf("Ctrl + V", "Ctrl + P", "Ctrl + X", "Ctrl + C"),
            2,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es 'Google Workspace' (antes G Suite) o 'Microsoft 365'?",
            listOf(
                "Antivirus para empresas",
                "Navegadores de internet especializados",
                "Sistemas operativos para móviles",
                "Paquetes de ofimática y productividad basados en la nube y suscripción"
            ),
            3,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve la herramienta 'Viñetas' (Bullets) en Word o PowerPoint?",
            listOf(
                "Para insertar pequeñas imágenes",
                "Para crear listas con puntos, guiones u otros símbolos al inicio de cada línea",
                "Para dibujar cuadrados",
                "Para subrayar el texto"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "Si seleccionas una imagen en Word y usas la opción 'Recortar', ¿qué estás haciendo?",
            listOf(
                "Disminuyendo la resolución",
                "Eliminando partes no deseadas de los bordes de la imagen",
                "Cambiando el color a blanco y negro",
                "Copiando la imagen"
            ),
            1,
            "Fácil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es una 'Hoja' dentro de un 'Libro' de Excel?",
            listOf(
                "Un documento de texto incrustado",
                "Un error del programa",
                "Una pestaña individual dentro del archivo principal que contiene su propia cuadrícula de datos",
                "Una impresión en papel"
            ),
            2,
            "Fácil",
            "Ofimática"
        ),

        // ==========================================
        // CATEGORÍA: OFIMÁTICA - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "En Excel, ¿para qué sirve la función =BUSCARV() (o VLOOKUP)?",
            listOf(
                "Para sumar todos los valores",
                "Para buscar un valor en la primera columna de una tabla y devolver el valor de la misma fila en otra columna",
                "Para buscar virus en el documento",
                "Para buscar una palabra y ponerla en negrita"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Cuál es la principal diferencia en PowerPoint entre una 'Transición' y una 'Animación'?",
            listOf(
                "Son exactamente lo mismo",
                "La transición mueve el texto y la animación mueve la foto",
                "La transición es el efecto de paso entre una diapositiva y otra, la animación es el movimiento de elementos individuales dentro de una diapositiva",
                "La animación requiere internet"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿para qué sirve hacer un 'Salto de página' (Ctrl + Enter)?",
            listOf(
                "Para cerrar el documento",
                "Para forzar que el texto a continuación comience en el inicio de la siguiente página independientemente del espacio libre",
                "Para cambiar los márgenes",
                "Para borrar la página actual"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es una 'Tabla dinámica' (Pivot Table) en Excel?",
            listOf(
                "Una tabla que cambia de color al hacer clic",
                "Una tabla importada de Word",
                "Una herramienta avanzada para calcular, resumir, analizar y cruzar grandes cantidades de datos fácilmente sin escribir fórmulas",
                "Una tabla que se mueve por la pantalla"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, si copias una fórmula y quieres que la referencia a una celda específica NO cambie al arrastrarla, ¿qué debes usar?",
            listOf(
                "Paréntesis ()",
                "Símbolo del dólar $ (Referencia absoluta)",
                "Corchetes []",
                "Comillas \"\""
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve la función 'Combinar correspondencia' en Word?",
            listOf(
                "Para enviar el mismo documento a múltiples destinatarios personalizados insertando automáticamente sus nombres o datos desde una lista (ej. Excel)",
                "Para juntar dos archivos de Word en uno",
                "Para que dos personas editen a la vez",
                "Para traducir el texto en correos electrónicos"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué hace el 'Formato condicional'?",
            listOf(
                "Da formato a todo el archivo si guardas",
                "Obliga a poner contraseñas",
                "Cambia automáticamente la apariencia (color, icono) de una celda según una regla o el valor que contenga (ej. rojo si es negativo)",
                "Borra condiciones de texto"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un 'Salto de sección' en Word?",
            listOf(
                "Una división invisible que permite aplicar formatos diferentes en partes distintas del documento (ej. páginas verticales y horizontales mezcladas)",
                "Un salto a la página 1",
                "Una línea que divide columnas",
                "Un punto en el que el programa se guarda solo"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué hace la función =SI() (o IF)?",
            listOf(
                "Dice 'Sí' si la tabla es correcta",
                "Suma los valores de la fila",
                "Comprueba una condición lógica y devuelve un valor si es verdadera y otro distinto si es falsa",
                "Traduce el texto al español"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es el 'Patrón de diapositivas' (Slide Master) en PowerPoint?",
            listOf(
                "El usuario que crea la presentación",
                "Una vista especial donde controlas el diseño y formato general que se aplicará automáticamente a todas las diapositivas de la presentación",
                "Un dibujo de fondo",
                "La última diapositiva de resumen"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿para qué se utilizan los 'Estilos' (como Título 1, Título 2, Normal)?",
            listOf(
                "Solo para poner las letras más grandes",
                "Para cambiar el color del fondo",
                "Para aplicar formato consistente rápidamente y permitir la creación automática de índices o tablas de contenido",
                "Para proteger el texto contra copias"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, si quieres que una columna con nombres largos siempre se muestre completa sin cambiar el ancho, ¿qué opción usas?",
            listOf(
                "Ocultar fila",
                "Negrita",
                "Ajustar texto (Wrap text) para que se ponga en varias líneas dentro de la celda",
                "Fusionar y centrar"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué se usa la herramienta 'Filtro' en una tabla de Excel?",
            listOf(
                "Para borrar los datos inútiles",
                "Para buscar errores ortográficos",
                "Para ocultar temporalmente las filas que no cumplen con los criterios seleccionados y ver solo la información deseada",
                "Para cambiar los colores a blanco y negro"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿cómo puedes asegurarte de que una tabla quede siempre en el centro de los márgenes?",
            listOf(
                "Poniendo espacios en blanco a la izquierda",
                "En las propiedades de tabla, eligiendo alineación centrada",
                "Agrandándola con el ratón",
                "Borrando columnas"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =CONTAR() en Excel?",
            listOf(
                "Cuenta el número de caracteres en una palabra",
                "Cuenta cuántas celdas en un rango contienen números",
                "Cuenta las celdas vacías",
                "Suma todos los valores"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =CONCATENAR() (o usar el símbolo &) en Excel?",
            listOf(
                "Suma valores numéricos ocultos",
                "Unir o juntar el texto de varias celdas en una sola celda",
                "Dividir un texto en columnas",
                "Borrar celdas repetidas"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿cómo se seleccionan celdas o rangos que NO están juntos (no contiguos)?",
            listOf(
                "Manteniendo pulsada la tecla Shift (Mayús)",
                "Manteniendo pulsada la tecla Alt",
                "Manteniendo pulsada la tecla Ctrl mientras se hace clic en las celdas",
                "Haciendo doble clic rápido"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve el botón 'Combinar y centrar' en Excel?",
            listOf(
                "Une varias celdas seleccionadas en una sola celda más grande y centra su contenido",
                "Suma dos celdas",
                "Centra el texto en la página al imprimir",
                "Combina dos archivos de Excel diferentes"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En un documento de Word largo, ¿qué herramienta de la pestaña 'Vista' sirve para ver la estructura de títulos y mover bloques enteros de texto fácilmente?",
            listOf(
                "Modo de lectura",
                "Esquema (Outline) o Panel de navegación",
                "Zoom al 100%",
                "Regla de márgenes"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es una 'Plantilla' (.dotx en Word o .xltx en Excel)?",
            listOf(
                "Un documento base preformateado que sirve como punto de partida para crear nuevos documentos con diseño idéntico",
                "Un documento protegido que no se puede abrir",
                "Una imagen de fondo",
                "Un archivo temporal de autoguardado"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué es 'Inmovilizar paneles'?",
            listOf(
                "Bloquear el archivo con contraseña",
                "Congelar ciertas filas o columnas (como los encabezados) para que se mantengan visibles al hacer scroll hacia abajo o a la derecha",
                "Impedir que el texto se mueva en la celda",
                "Apagar el monitor temporalmente"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué ocurre si seleccionas una fila en Excel y pulsas 'Ocultar'?",
            listOf(
                "Se borran los datos",
                "La fila desaparece visualmente pero los datos siguen ahí y pueden ser usados en cálculos y vueltos a mostrar",
                "El texto se vuelve blanco",
                "El archivo se cifra"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es LibreOffice?",
            listOf(
                "Un sistema operativo",
                "Una marca de impresoras",
                "Una potente suite ofimática de código abierto y gratuita, alternativa a Microsoft Office",
                "Un programa para leer PDFs exclusivamente"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve insertar un 'Comentario' en Word o Excel?",
            listOf(
                "Para escribir código de programación",
                "Para añadir notas o revisiones al margen que no forman parte del texto principal y son útiles al trabajar en equipo",
                "Para traducir el texto",
                "Para borrar contenido oculto"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, si quieres que una imagen entre volando al hacer clic y luego se desvanezca al siguiente clic, ¿qué debes usar?",
            listOf(
                "El modo presentación",
                "Transiciones",
                "Dos animaciones distintas sobre la misma imagen (entrada y salida)",
                "El zoom de la diapositiva"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué herramienta en Word te permite crear organigramas, diagramas de procesos o jerarquías gráficamente y de forma sencilla?",
            listOf("Gráficos circulares", "SmartArt", "WordArt", "Formas básicas"),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿para qué sirve la función 'Texto en columnas'?",
            listOf(
                "Para cambiar la fuente del texto",
                "Para dividir el contenido de una celda (ej. un nombre completo) en varias columnas separadas por un delimitador (ej. un espacio o coma)",
                "Para combinar celdas",
                "Para poner el texto en vertical"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado en Excel sirve para seleccionar toda la hoja o en Word para seleccionar todo el documento?",
            listOf(
                "Ctrl + E (en español) / Ctrl + A (en inglés)",
                "Ctrl + S",
                "Ctrl + T",
                "Ctrl + P"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, al ver un pequeño triángulo rojo en la esquina superior derecha de una celda, ¿qué indica?",
            listOf(
                "Que la celda contiene un comentario",
                "Que la fórmula tiene un error",
                "Que es un valor negativo",
                "Que la celda está bloqueada"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve la opción 'Marcas de revisión' (Control de cambios / Track Changes) en Word?",
            listOf(
                "Para dibujar en la pantalla",
                "Para cambiar el idioma",
                "Para ver el historial del documento",
                "Para registrar, visualizar y aceptar o rechazar cualquier edición, borrado o cambio que se haga en el documento"
            ),
            3,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un 'Hipervínculo' en un documento?",
            listOf(
                "Un texto con letra muy grande",
                "Un archivo muy rápido de abrir",
                "Un texto o imagen que, al hacer clic, te redirige a una página web, a otro archivo o a una parte del mismo documento",
                "Una imagen en 3D"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la opción 'Imprimir selección' en Word o Excel?",
            listOf(
                "Imprime todas las hojas menos la seleccionada",
                "Imprime el documento completo en blanco y negro",
                "Solo envía a la impresora el bloque de texto o celdas específicas que el usuario ha resaltado previamente con el ratón",
                "Imprime las fotos del documento"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué es un rango de celdas?",
            listOf(
                "Un grupo de celdas contiguas seleccionadas en forma rectangular (ej. A1:C10)",
                "El color de la fila",
                "La distancia entre dos columnas",
                "El nombre de la hoja"
            ),
            0,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué formato es el predeterminado para guardar un archivo moderno en Microsoft Excel (desde la versión 2007)?",
            listOf(".xls", ".xlsx", ".xlsm", ".csv"),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué formato es el predeterminado para guardar un archivo moderno en Microsoft Word?",
            listOf(".doc", ".txt", ".docx", ".rtf"),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué significa exportar un archivo a formato .CSV en Excel?",
            listOf(
                "Guardar el archivo como foto",
                "Guardar el archivo como Valores Separados por Comas, un formato de texto plano universal para tablas",
                "Guardarlo en la nube de forma segura",
                "Protegerlo con contraseña"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿En PowerPoint, qué es el 'Intervalo' o ensayo de tiempos?",
            listOf(
                "El tiempo que tarda el programa en abrir",
                "El espacio entre dos textos",
                "La duración asignada a una transición o el proceso de grabar cuánto tiempo te tomas en cada diapositiva para que pasen solas",
                "Una alarma para acabar la reunión"
            ),
            2,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "Si quieres insertar una ecuación matemática compleja con fracciones y raíces en Word, ¿qué función utilizas?",
            listOf(
                "WordArt",
                "El Editor de Ecuaciones (Insertar > Ecuación)",
                "Una captura de pantalla obligatoria",
                "SmartArt"
            ),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué atajo de teclado te permite aplicar formato de moneda rápidamente a los números seleccionados?",
            listOf("Ctrl + C", "Ctrl + Shift + $ (en muchos teclados)", "Alt + Enter", "F4"),
            1,
            "Medio",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es 'Proteger documento' en ofimática?",
            listOf(
                "Guardarlo en un pendrive",
                "Añadirle un antivirus propio al archivo",
                "Asignarle una contraseña para que solo puedan abrirlo o modificarlo quienes la conozcan o restringir ciertos permisos de edición",
                "Ponerlo en modo solo lectura para siempre"
            ),
            2,
            "Medio",
            "Ofimática"
        ),

        // ==========================================
        // CATEGORÍA: OFIMÁTICA - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "En Excel, ¿qué gran ventaja ofrece usar BUSCARX (XLOOKUP) frente al tradicional BUSCARV (VLOOKUP)?",
            listOf(
                "Es más bonito visualmente",
                "No existe BUSCARX",
                "Permite buscar en cualquier dirección (izquierda o derecha de la columna base) y maneja automáticamente errores si no hay resultados",
                "Funciona sin ordenador"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es una Macro en Excel o Word?",
            listOf(
                "Una fórmula matemática compleja",
                "Una función para aumentar el zoom al máximo",
                "Una secuencia de instrucciones y acciones grabadas o programadas que automatizan tareas repetitivas",
                "Un gráfico tridimensional"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿En qué lenguaje de programación están basadas las Macros de Microsoft Office?",
            listOf("Java", "Python", "VBA (Visual Basic for Applications)", "C++"),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, si tienes la fórmula '=A1*B$1' y la arrastras una celda hacia abajo, ¿cómo quedará en la nueva celda?",
            listOf("=A2*B$1", "=A1*B$2", "=A2*B$2", "=A1*B$1"),
            0,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué se usan la combinación de fórmulas INDICE y COINCIDIR (INDEX and MATCH) en Excel?",
            listOf(
                "Para sumar valores con errores",
                "Para concatenar textos largos",
                "Para realizar búsquedas bidimensionales y dinámicas más potentes y flexibles que BUSCARV, sin depender del orden de las columnas",
                "Para crear índices automáticos en un libro"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿qué son los 'Códigos de campo' (Field codes)?",
            listOf(
                "Contraseñas ocultas en el texto",
                "Errores de formato",
                "Marcadores de posición dinámicos que muestran datos que pueden cambiar, como la fecha de hoy, el número de página o referencias cruzadas",
                "Virus de macros"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué extensión tiene un archivo de Excel habilitado específicamente para contener y ejecutar Macros?",
            listOf(".xlsx", ".xlsm", ".xlsb", ".xls"),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué es la herramienta 'Validación de datos'?",
            listOf(
                "Un corrector ortográfico avanzado",
                "Una regla que restringe qué tipo de datos o valores se pueden introducir en una celda (ej. crear un menú desplegable o limitar a números entre 1 y 10)",
                "Una herramienta para recuperar archivos borrados",
                "Una contraseña de acceso"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Microsoft Access, ¿cuál es el objeto principal diseñado para recopilar, mostrar e interactuar fácilmente con los datos de las tablas como si fuera una 'pantalla' de usuario?",
            listOf("Módulo", "Consulta", "Informe", "Formulario"),
            3,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En una tabla dinámica de Excel, ¿qué son los 'Campos calculados'?",
            listOf(
                "Nuevas celdas escritas a mano",
                "Formato condicional en la tabla",
                "Campos personalizados creados por el usuario que realizan cálculos usando los datos de otros campos existentes en la propia tabla dinámica",
                "Errores de cálculo"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =SI.ERROR() (o IFERROR) en Excel?",
            listOf(
                "Provoca un error si la fórmula está mal",
                "Evalúa una fórmula; si da error, devuelve un valor alternativo que tú especificas; si no, devuelve el resultado normal",
                "Borra el archivo entero",
                "Pone el fondo en rojo"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿En Word, qué es la 'Viuda y Huérfana' dentro del control de líneas y párrafos?",
            listOf(
                "Un error de impresión",
                "Una técnica de diseño gráfico",
                "Ajustes automáticos que evitan que la primera o la última línea de un párrafo queden aisladas solas al principio o final de una página",
                "Un tipo de fuente clásica"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿para qué se utiliza la herramienta 'Buscar objetivo' (Goal Seek) dentro del Análisis Y si?",
            listOf(
                "Para buscar palabras en el libro",
                "Para encontrar rápidamente el valor de entrada necesario en una fórmula para conseguir el resultado exacto deseado",
                "Para buscar celdas con errores",
                "Para crear un gráfico circular automáticamente"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué se utilizan las 'Tablas de datos' (Data Tables) en el análisis de sensibilidad de Excel?",
            listOf(
                "Para escribir nombres en filas y columnas",
                "Para ver todos los resultados posibles de una o varias fórmulas al cambiar una o dos variables simultáneamente",
                "Para importar bases de datos SQL",
                "Para colorear las celdas alternativamente"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, si quieres crear un índice automático de contenidos, ¿qué requisito debes haber cumplido primero al dar formato al documento?",
            listOf(
                "Poner todo el texto en negrita",
                "Haber utilizado los Estilos de Título (Título 1, Título 2...) para marcar las secciones",
                "Haber subrayado todos los encabezados",
                "Numerar las páginas a mano"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es la herramienta 'Power Query' integrada en las versiones modernas de Excel?",
            listOf(
                "Una función para buscar errores en las celdas",
                "Un módulo potente de extracción, transformación y carga (ETL) para conectar fuentes de datos externas y limpiar datos masivos antes de analizarlos",
                "Un creador de macros visual",
                "Una forma de hacer diapositivas en Excel"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la función =DESREF() (o OFFSET) en Excel?",
            listOf(
                "Resta dos celdas y borra la original",
                "Devuelve una referencia a un rango que es un número especificado de filas y columnas respecto a una celda inicial, permitiendo crear rangos dinámicos",
                "Convierte números en texto",
                "Abre un enlace de internet"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿En qué consiste 'Resolver' (Solver) en Excel?",
            listOf(
                "Es un traductor de idiomas",
                "Un complemento avanzado de análisis estadístico y de optimización lineal/no lineal que busca el valor óptimo de una celda objetivo variando múltiples celdas sujetas a restricciones",
                "Repara archivos corruptos",
                "Calcula el mínimo común múltiplo"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo de teclado en Excel (Windows) fija las referencias de celdas convirtiéndolas en absolutas (ej. de A1 a \$A\$1) al editar la fórmula?",
            listOf("F4", "F1", "F12", "F5"),
            0,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿para qué sirven las 'Referencias Cruzadas'?",
            listOf(
                "Para comparar dos documentos en pantalla partida",
                "Para vincular automáticamente a elementos del mismo documento, como figuras, tablas o epígrafes, actualizando el número de página si se mueven",
                "Para traducir de inglés a español",
                "Para cruzar palabras en un juego integrado"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un archivo .CSV?",
            listOf(
                "Un formato de Excel de solo lectura",
                "Comma Separated Values; un archivo de texto plano donde los datos están separados por comas, ampliamente usado para importar/exportar bases de datos",
                "Cascading Style View; un archivo de diseño",
                "Un script para ejecutar macros"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué significa la opción de pegado especial 'Trasponer' (Transpose) en Excel?",
            listOf(
                "Pegar los datos con colores transparentes",
                "Copiar los datos de otro libro distinto",
                "Pegar un rango de celdas copiadas convirtiendo las filas en columnas, y las columnas en filas",
                "Pegar como imagen"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Para qué sirve la fórmula =SUMAR.SI.CONJUNTO() (SUMIFS)?",
            listOf(
                "Para sumar valores que cumplan un único criterio",
                "Para sumar valores numéricos que cumplan múltiples condiciones o criterios simultáneamente en diferentes rangos",
                "Para sumar celdas conjuntas sin importar su contenido",
                "Para calcular un porcentaje general"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, si aplicas un 'Sangría Francesa' (Hanging indent) a un párrafo, ¿qué ocurre?",
            listOf(
                "Todo el párrafo se mueve a la derecha",
                "La primera línea empieza más a la derecha que el resto",
                "La primera línea permanece pegada al margen izquierdo, y todas las siguientes líneas del párrafo se desplazan hacia la derecha",
                "El párrafo se centra"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué son los 'Slicers' (Segmentación de datos) en Excel?",
            listOf(
                "Herramientas para cortar texto",
                "Botones visuales y de fácil manejo utilizados para filtrar rápidamente datos interactivos en tablas dinámicas",
                "Un formato de gráfico que corta tartas",
                "Macros para borrar filas"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿En Excel, qué es la función =INDIRECTO()?",
            listOf(
                "Manda un correo sin avisar",
                "Crea una flecha en el gráfico",
                "Devuelve la referencia a una celda especificada por una cadena de texto dentro de otra celda, permitiendo referencias dinámicas",
                "Multiplica valores ocultos"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Cuál es la función principal de Microsoft Publisher dentro de la suite antigua/tradicional?",
            listOf(
                "Editar vídeo",
                "Publicar en redes sociales automáticamente",
                "Maquetación, diseño editorial y creación de publicaciones impresas (folletos, boletines) más centrado en el diseño visual que Word",
                "Gestionar servidores de bases de datos"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, si quieres crear un índice interactivo visual en lugar del típico listado de viñetas moderno, ¿qué función introducida recientemente usarías?",
            listOf(
                "SmartArt Index",
                "Transición de Transformación",
                "Zoom de diapositiva o Zoom de sección",
                "Macro de hipervínculo"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué atajo usas en Excel para introducir la Fecha Actual estática en una celda (sin usar la fórmula HOY)?",
            listOf("Ctrl + T", "Ctrl + Shift + F", "Ctrl + ; (punto y coma)", "Alt + Enter"),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Word, ¿para qué usarías la herramienta 'Restringir edición'?",
            listOf(
                "Para que el archivo pese menos",
                "Para configurar que partes específicas del documento no puedan ser modificadas, o permitir solo rellenar formularios o añadir comentarios",
                "Para evitar que se imprima",
                "Para reducir el número de páginas máximo"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué es un 'Esquema' o agrupar filas/columnas en Excel (Data Grouping)?",
            listOf(
                "Hacer un dibujo con celdas",
                "Un archivo protegido por contraseña",
                "Una función que permite colapsar y expandir secciones de datos (filas o columnas) para resumir y ocultar el detalle rápidamente",
                "Poner un borde grueso alrededor de los datos"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Access, ¿cuál es la diferencia principal entre una Tabla y una Consulta?",
            listOf(
                "Ninguna, son iguales",
                "La tabla guarda los datos permanentemente, la consulta sirve para filtrarlos, unirlos y extraer información específica basada en criterios lógicos sin duplicar el almacenamiento",
                "La consulta no se puede guardar, la tabla sí",
                "La tabla es para números y la consulta para textos"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En Excel, ¿qué herramienta utilizarías para consolidar (sumar, promediar) en una sola hoja los datos que están dispersos en exactamente la misma posición en múltiples hojas distintas?",
            listOf("Consolidar datos", "Pegado Especial", "Autosuma 3D", "Macro de unión"),
            0,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué hace la opción 'Imprimir títulos' (Print Titles) en la configuración de página de Excel?",
            listOf(
                "Pone el nombre del archivo en letras gigantes en la portada",
                "Repite las filas o columnas especificadas en la parte superior/izquierda de cada página impresa para que los datos no pierdan su contexto",
                "Imprime solo la primera hoja",
                "Cambia el color de la tinta"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "En PowerPoint, ¿qué es la herramienta 'Guías' y 'Cuadrícula'?",
            listOf(
                "Líneas no imprimibles en pantalla que ayudan a alinear y posicionar objetos simétricamente con precisión",
                "El manual de instrucciones del programa",
                "Un índice automático de diapositivas",
                "Plantillas de colores de fondo"
            ),
            0,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué fórmula de texto en Excel elimina los espacios en blanco adicionales al principio, al final o dobles espacios entre palabras de un texto, dejando solo un espacio normal?",
            listOf("=LIMPIAR()", "=ESPACIOS() (TRIM)", "=BORRAR()", "=REDUCIR()"),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿En Word, qué es un 'Marcador' (Bookmark)?",
            listOf(
                "Un dibujo en el borde del texto",
                "Una contraseña maestra",
                "Un nombre o referencia asignada a una ubicación o bloque de texto específico para poder saltar rápidamente a él o usarlo en hipervínculos",
                "Un color para subrayar"
            ),
            2,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "Si quieres insertar una hoja de Excel viva y funcional incrustada dentro de una diapositiva de PowerPoint o documento de Word, se utiliza la tecnología:",
            listOf(
                "VBA (Visual Basic for Applications)",
                "OLE (Object Linking and Embedding)",
                "API (Application Programming Interface)",
                "XML"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué función de Excel permite crear listas desplegables dinámicas cuyo contenido dependa de lo que se seleccionó en OTRA lista desplegable anterior (listas dependientes)?",
            listOf(
                "Usar =BUSCARV con Formato Condicional",
                "Usar Validación de datos combinada con la fórmula =INDIRECTO",
                "Usar Tablas Dinámicas",
                "No se puede hacer en Excel sin programar VBA"
            ),
            1,
            "Difícil",
            "Ofimática"
        ),
        Pregunta(
            "¿Qué nueva tecnología subyacente de matrices de cálculo en Excel 365 introdujo el concepto de 'Desbordamiento' (Spill), permitiendo a una fórmula devolver múltiples valores en celdas contiguas?",
            listOf("Power Pivot", "VBA Arrays", "Matrices Dinámicas (Dynamic Arrays)", "Solver"),
            2,
            "Difícil",
            "Ofimática"
        ),
        // ==========================================
        // CATEGORÍA: BASES DE DATOS - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Qué significan las siglas BD o DB en informática?",
            listOf(
                "Banda Digital",
                "Base de Datos (Database)",
                "Bloque de Datos",
                "Buscador Directo"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Para qué sirve principalmente una base de datos?",
            listOf(
                "Para reproducir música",
                "Para almacenar, organizar y gestionar información de forma estructurada",
                "Para diseñar páginas web",
                "Para proteger el PC de virus"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué lenguaje estándar se utiliza mundialmente para consultar y manipular bases de datos relacionales?",
            listOf("HTML", "Java", "SQL", "C++"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "En una base de datos relacional, ¿cómo se llama la estructura de cuadrícula que contiene los datos?",
            listOf("Carpeta", "Tabla", "Formulario", "Párrafo"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Dentro de una tabla, ¿qué representa una 'Fila' (Row) o 'Registro'?",
            listOf(
                "Un tipo de dato",
                "Un conjunto de datos relacionados que pertenecen a un único elemento o entidad",
                "El nombre de la base de datos",
                "El título de las columnas"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Dentro de una tabla, ¿qué representa una 'Columna' (Column) o 'Campo'?",
            listOf(
                "Una categoría específica de información, como el 'Nombre' o la 'Edad' de todos los registros",
                "Una contraseña de seguridad",
                "Un usuario conectado",
                "Un archivo borrado"
            ),
            0,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es una 'Clave Primaria' (Primary Key) en una tabla?",
            listOf(
                "La contraseña del administrador",
                "Un identificador único e irrepetible para cada fila o registro de esa tabla (ej. DNI o ID)",
                "El nombre de la primera columna",
                "Un virus de SQL"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál de los siguientes es un sistema gestor de bases de datos relacionales muy popular y gratuito?",
            listOf("MySQL", "Adobe Photoshop", "Microsoft Word", "Windows 11"),
            0,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué empresa desarrolla y mantiene la famosa base de datos comercial 'Oracle Database'?",
            listOf("Microsoft", "Google", "Oracle Corporation", "Apple"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué programa de la suite Microsoft Office se utiliza para crear bases de datos de escritorio sencillas?",
            listOf("Excel", "PowerPoint", "Access", "Word"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando de SQL se utiliza para buscar y extraer información de una base de datos?",
            listOf("EXTRACT", "SELECT", "FIND", "GET"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Si quieres añadir un nuevo registro o usuario a una tabla, ¿qué comando SQL usas?",
            listOf("ADD NEW", "INSERT INTO", "PUT DATA", "CREATE ROW"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL sirve para actualizar o modificar los datos de un registro existente?",
            listOf("CHANGE", "MODIFY", "UPDATE", "EDIT"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL debes usar con mucho cuidado porque borra registros de una tabla?",
            listOf("REMOVE", "DELETE", "ERASE", "DROP ROW"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué cláusula de SQL acompaña al SELECT para filtrar resultados bajo una condición (ej. clientes mayores de 18 años)?",
            listOf("IF", "WHEN", "WHERE", "FILTER"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "En el comando 'SELECT * FROM Usuarios', ¿qué significa el asterisco (*)?",
            listOf(
                "Que multiplique los valores",
                "Que seleccione TODAS las columnas de la tabla",
                "Que oculte las contraseñas",
                "Que busque errores en la tabla"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa que una base de datos esté 'en la nube' (Cloud Database)?",
            listOf(
                "Que se borra cuando llueve",
                "Que está almacenada y gestionada en servidores de internet (como AWS o Google Cloud) en lugar de un disco local",
                "Que no tiene tablas",
                "Que es de código abierto"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es el tipo de dato SQL adecuado para almacenar el nombre de una persona?",
            listOf("INT o INTEGER", "VARCHAR o TEXT", "DATE", "BOOLEAN"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es el tipo de dato SQL adecuado para almacenar la cantidad de hijos que tiene una persona?",
            listOf("INT (Entero)", "VARCHAR (Texto)", "FLOAT (Decimal)", "DATE (Fecha)"),
            0,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué valor especial se usa en SQL para representar un dato 'vacío', desconocido o inexistente en una celda?",
            listOf("ZERO", "BLANK", "NULL", "NONE"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Si un campo se define como BOOLEAN, ¿qué valores puede contener?",
            listOf(
                "Cualquier número",
                "Solo texto",
                "Solo Verdadero o Falso (True/False)",
                "Fechas exactas"
            ),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cómo se ordenan los resultados de una consulta SQL alfabéticamente o numéricamente?",
            listOf("SORT BY", "ORDER BY", "ARRANGE", "ALIGN"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa la sigla RDBMS en inglés?",
            listOf(
                "Real Database Memory System",
                "Relational Database Management System (Sistema Gestor de Bases de Datos Relacionales)",
                "Random Data Binary Model System",
                "Redundant Database Main System"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál de estos sistemas NO es una base de datos relacional (no usa tablas tradicionales)?",
            listOf("PostgreSQL", "Microsoft SQL Server", "MongoDB", "MariaDB"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Backup' de una base de datos?",
            listOf(
                "Un virus de borrado",
                "Una copia de seguridad de todos los datos para prevenir pérdidas en caso de fallos",
                "Un usuario de prueba",
                "Una tabla secundaria"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "En bases de datos, ¿qué significa 'Query'?",
            listOf(
                "Un error de conexión",
                "Una pregunta o 'consulta' escrita en código para pedirle información a la base de datos",
                "El administrador del sistema",
                "La contraseña de cifrado"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué palabra clave en SQL se usa para crear una nueva tabla vacía?",
            listOf("NEW TABLE", "BUILD TABLE", "CREATE TABLE", "MAKE TABLE"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál de estas aplicaciones web gigantes NO podría funcionar sin inmensas bases de datos detrás?",
            listOf(
                "Calculadora de Windows",
                "Facebook, Amazon, YouTube...",
                "Bloc de notas local",
                "Buscaminas"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Es seguro guardar contraseñas de usuarios en texto plano (como '123456') en una base de datos?",
            listOf(
                "Sí, es más rápido",
                "No, nunca. Las contraseñas siempre deben estar encriptadas o tener un hash",
                "Depende de la tabla",
                "Sí, si el servidor tiene antivirus"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es 'Microsoft SQL Server'?",
            listOf(
                "Un programa de diseño 3D",
                "Un sistema operativo",
                "Un sistema de gestión de bases de datos relacionales desarrollado por Microsoft",
                "Un antivirus"
            ),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué herramienta visual clásica se usa mucho para administrar bases de datos MySQL desde un navegador web?",
            listOf("phpMyAdmin", "cPanel DB", "SQL Web Viewer", "Oracle GUI"),
            0,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Si quieres contar cuántos usuarios hay registrados en total, ¿qué función SQL utilizas?",
            listOf("SUM()", "COUNT()", "TOTAL()", "ADD()"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Si quieres encontrar el precio más alto de una tabla de productos, ¿qué función SQL usas?",
            listOf("HIGH()", "TOP()", "MAX()", "PEAK()"),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "Si quieres calcular el promedio de las edades en una tabla, ¿qué función SQL usas?",
            listOf("MEDIAN()", "AVG()", "MEAN()", "PROMEDIO()"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué cláusula SQL se utiliza para eliminar registros duplicados en los resultados de una consulta?",
            listOf("UNIQUE", "DISTINCT", "NO DUPLICATES", "SINGLE"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué pasa si haces un comando 'UPDATE Usuarios SET Edad = 20' SIN poner una condición WHERE?",
            listOf(
                "Da error y no hace nada",
                "Borra a los usuarios de 20 años",
                "Actualiza y pone 20 años a TODOS los usuarios de la tabla",
                "Solo actualiza al primer usuario"
            ),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué término se usa para la acción de importar información desde un archivo de Excel o CSV hacia una tabla de base de datos?",
            listOf("Renderizar", "Migrar / Importar", "Formatear", "Compilar"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es el lenguaje en el que se representan los datos en una base de datos documental moderna como MongoDB?",
            listOf("XML", "JSON (o BSON)", "HTML", "C#"),
            1,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Administrador de Base de Datos' (DBA)?",
            listOf(
                "Un tipo de servidor físico",
                "Un algoritmo de búsqueda",
                "El profesional informático responsable de diseñar, mantener y asegurar las bases de datos de una organización",
                "Una contraseña maestra"
            ),
            2,
            "Fácil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Las bases de datos relacionales tradicionales organizan los datos principalmente basándose en qué concepto matemático?",
            listOf(
                "Geometría",
                "Álgebra relacional y teoría de conjuntos",
                "Cálculo diferencial",
                "Estadística cuántica"
            ),
            1,
            "Fácil",
            "Bases de Datos"
        ),

        // ==========================================
        // CATEGORÍA: BASES DE DATOS - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Qué es una 'Clave Foránea' (Foreign Key)?",
            listOf(
                "Una clave robada por hackers",
                "Una columna que crea un vínculo o relación directa con la Clave Primaria de otra tabla",
                "Una columna de contraseñas de usuarios",
                "Un índice que ordena textos"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Para qué sirve el comando JOIN en SQL?",
            listOf(
                "Para conectar el servidor a internet",
                "Para combinar y extraer filas de dos o más tablas basándose en una columna relacionada entre ellas",
                "Para unir dos bases de datos distintas",
                "Para sumar números de una fila"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es la diferencia entre un INNER JOIN y un LEFT JOIN?",
            listOf(
                "Ninguna, hacen lo mismo",
                "INNER trae todo, LEFT solo trae números",
                "INNER trae solo coincidencias de ambas tablas, LEFT trae todo lo de la tabla izquierda aunque no haya coincidencia en la derecha",
                "INNER se usa en MySQL y LEFT en Oracle"
            ),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Índice' (Index) en una base de datos?",
            listOf(
                "El menú de inicio",
                "Una estructura de datos oculta que mejora enormemente la velocidad de las búsquedas en una tabla, a costa de espacio en disco",
                "Una tabla secundaria",
                "Un listado impreso de errores"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es la 'Normalización' de bases de datos?",
            listOf(
                "Poner nombres normales a las tablas",
                "El proceso de organizar los datos para reducir la redundancia (duplicados) y asegurar la dependencia lógica",
                "Borrar datos antiguos",
                "Crear copias de seguridad cada día"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL borra permanentemente una tabla COMPLETA junto con su estructura (no solo sus datos)?",
            listOf("DELETE TABLE", "DROP TABLE", "REMOVE TABLE", "TRUNCATE TABLE"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL vacía todos los datos de una tabla rápidamente pero mantiene su estructura intacta?",
            listOf("TRUNCATE TABLE", "DROP TABLE", "FORMAT TABLE", "CLEAR TABLE"),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué cláusula SQL agrupa las filas que tienen los mismos valores en filas de resumen (muy usada con COUNT o SUM)?",
            listOf("ORDER BY", "MATCH WITH", "GROUP BY", "CLUSTER BY"),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "Cuando usas GROUP BY, ¿qué cláusula debes usar para filtrar esos grupos agregados (el equivalente al WHERE pero para grupos)?",
            listOf("HAVING", "FILTERING", "WHERE_GROUP", "CONTAINING"),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué concepto describe a las bases de datos NoSQL?",
            listOf(
                "No soportan lenguaje SQL, y suelen ser sistemas no relacionales, flexibles, distribuidos y diseñados para grandes volúmenes de datos (Big Data)",
                "Bases de datos que no tienen seguridad",
                "Bases de datos que no funcionan en internet",
                "Bases de datos exclusivas de Microsoft"
            ),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cómo almacena los datos principalmente MongoDB (una base de datos NoSQL)?",
            listOf(
                "En tablas y filas",
                "En grafos y nodos",
                "En documentos tipo JSON/BSON",
                "En archivos de texto separados por comas"
            ),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué tipo de base de datos es 'Redis'?",
            listOf(
                "Relacional pura",
                "Documental",
                "Almacén de clave-valor en memoria (Key-Value), extremadamente rápida",
                "De grafos"
            ),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En SQL, ¿qué operador se utiliza para buscar un patrón específico en una cadena de texto (ej. nombres que empiecen por 'A')?",
            listOf("MATCH", "LIKE", "SIMILAR", "REGEX"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En el operador LIKE, ¿qué símbolo actúa como comodín para representar cero, uno o múltiples caracteres?",
            listOf("?", "*", "%", "$"),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es una 'Vista' (View) en SQL?",
            listOf(
                "La interfaz gráfica del usuario",
                "Una tabla virtual basada en el conjunto de resultados de una consulta SQL predefinida",
                "Un comando para imprimir resultados",
                "Un tipo de permiso de administrador"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL permite añadir o eliminar columnas en una tabla que ya existe?",
            listOf("MODIFY TABLE", "ALTER TABLE", "UPDATE TABLE", "CHANGE TABLE"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es SQLite?",
            listOf(
                "Una base de datos en la nube de Google",
                "Un motor de base de datos relacional ligero, autocontenido en un solo archivo, muy usado en aplicaciones móviles (Android/iOS) y navegadores",
                "Un antivirus de servidores",
                "Una versión de pago de MySQL"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En el modelo Entidad-Relación (ER), ¿qué tipo de relación es cuando un estudiante puede tener muchos profesores, y un profesor puede tener muchos estudiantes?",
            listOf(
                "Uno a Uno (1:1)",
                "Uno a Muchos (1:N)",
                "Muchos a Muchos (N:M)",
                "Cero a Muchos (0:N)"
            ),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En una relación 'Muchos a Muchos', ¿cómo se resuelve normalmente en una base de datos relacional?",
            listOf(
                "Creando una tercera tabla intermedia (o tabla puente) que contiene las claves foráneas de las dos tablas originales",
                "Borrando duplicados",
                "Poniendo dos claves primarias en la misma tabla",
                "Usando el comando JOIN MANY"
            ),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué función SQL devuelve la fecha y hora actual del sistema?",
            listOf("TODAY()", "NOW() / CURRENT_TIMESTAMP", "DATE()", "SYSTEM_TIME()"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa la restricción (constraint) 'UNIQUE' en una columna?",
            listOf(
                "Que el valor no puede estar vacío (no puede ser NULL)",
                "Que todos los valores de esa columna en la tabla deben ser diferentes entre sí (no se admiten duplicados)",
                "Que es la clave foránea",
                "Que solo admite texto en mayúsculas"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es la diferencia entre UNION y UNION ALL en SQL?",
            listOf(
                "UNION elimina los registros duplicados del resultado final, UNION ALL los mantiene todos",
                "UNION es para números y UNION ALL para texto",
                "UNION ALL es más lento pero más seguro",
                "Ninguna, son lo mismo"
            ),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En PostgreSQL, ¿qué tipo de dato se usa para almacenar datos verdaderos/falsos?",
            listOf("BIT", "TINYINT", "BOOLEAN", "VARFLAG"),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa DDL en el contexto de SQL (CREATE, ALTER, DROP)?",
            listOf(
                "Data Definition Language (Lenguaje de Definición de Datos)",
                "Data Design Layout",
                "Direct Database Link",
                "Dynamic Data Logic"
            ),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa DML en el contexto de SQL (SELECT, INSERT, UPDATE, DELETE)?",
            listOf(
                "Data Machine Language",
                "Database Memory Level",
                "Data Manipulation Language (Lenguaje de Manipulación de Datos)",
                "Digital Modification Loop"
            ),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué operador usarías en la cláusula WHERE para obtener los registros donde el precio está entre 10 y 50?",
            listOf("RANGE 10 TO 50", "BETWEEN 10 AND 50", "IN (10, 50)", "FROM 10 TO 50"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué operador de SQL te permite especificar múltiples valores exactos en una cláusula WHERE, ej. WHERE Ciudad ___ ('Madrid', 'Barcelona', 'Sevilla')?",
            listOf("LIKE", "IN", "HAS", "ANY"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es una transacción (Transaction) en una base de datos?",
            listOf(
                "Una transferencia de dinero",
                "Una secuencia de operaciones SQL tratadas como una única unidad de trabajo lógica (todo o nada)",
                "Una copia de seguridad programada",
                "El proceso de encender el servidor"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL se usa para guardar permanentemente los cambios de una transacción completada con éxito?",
            listOf("SAVE", "COMMIT", "DONE", "APPLY"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL se usa para deshacer o revertir una transacción si ocurre un error antes del COMMIT?",
            listOf("UNDO", "REVERT", "ROLLBACK", "CANCEL"),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué palabra clave se usa para autoincrementar el valor numérico de una clave primaria al insertar una nueva fila en MySQL?",
            listOf("AUTO_INCREMENT", "IDENTITY", "SERIAL", "NEXTVAL"),
            0,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué tipo de índice impide absolutamente que existan valores duplicados en la columna indexada?",
            listOf(
                "Índice Clúster (Clustered Index)",
                "Índice Único (Unique Index)",
                "Índice Bitmap",
                "Índice Full-Text"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué función SQL devuelve la longitud (número de caracteres) de una cadena de texto?",
            listOf("SIZE()", "LENGTH() / LEN()", "COUNT_TEXT()", "WIDTH()"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa la restricción 'NOT NULL'?",
            listOf(
                "Que el valor debe ser cero",
                "Que esa columna no acepta valores vacíos, siempre debe tener algún dato",
                "Que no se pueden usar números",
                "Que la columna es la clave principal"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es 'Firebase Realtime Database' o 'Firestore'?",
            listOf(
                "Bases de datos relacionales antiguas",
                "Soluciones de bases de datos NoSQL alojadas en la nube de Google, que sincronizan datos en tiempo real entre clientes",
                "Programas para recuperar archivos borrados",
                "Servidores físicos de Amazon"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "En diseño de BBDD, ¿qué es un campo 'calculado' o 'derivado' (ej. calcular Edad a partir de Fecha_Nacimiento)?",
            listOf(
                "Un campo que causa errores",
                "Un campo cuyo valor no se almacena físicamente, sino que se calcula en tiempo de consulta a partir de otros datos",
                "Una contraseña generada aleatoriamente",
                "Una columna de suma total en Excel"
            ),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué operador de SQL devuelve verdadero si la subconsulta devuelve algún registro?",
            listOf("SOME", "EXISTS", "HAS_DATA", "NOT_EMPTY"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando se utiliza en SQL para otorgar permisos a un usuario sobre una base de datos?",
            listOf("ALLOW", "GRANT", "GIVE", "PERMIT"),
            1,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando se utiliza para retirar permisos previamente concedidos a un usuario en SQL?",
            listOf("DENY", "TAKE", "REVOKE", "BLOCK"),
            2,
            "Medio",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué concepto se refiere al proceso de descubrir patrones, tendencias y correlaciones útiles en grandes conjuntos de bases de datos?",
            listOf(
                "Data Mining (Minería de Datos)",
                "Data Cleaning",
                "Data Backup",
                "Database Compiling"
            ),
            0,
            "Medio",
            "Bases de Datos"
        ),

        // ==========================================
        // CATEGORÍA: BASES DE DATOS - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Cuáles son las propiedades ACID que garantizan la fiabilidad de las transacciones en BBDD relacionales?",
            listOf(
                "Actividad, Código, Inteligencia, Datos",
                "Atomicidad, Consistencia, Aislamiento (Isolation), Durabilidad",
                "Asincronía, Cifrado, Integridad, Dependencia",
                "Autoridad, Caché, Índices, Dinamismo"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En las propiedades ACID, ¿qué significa la 'Atomicidad'?",
            listOf(
                "Que la transacción opera a nivel binario",
                "Que todas las operaciones de la transacción se ejecutan con éxito, o ninguna se ejecuta (es indivisible)",
                "Que aísla a los usuarios",
                "Que los datos sobreviven a un fallo eléctrico"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué establece el 'Teorema CAP' formulado por Eric Brewer para sistemas distribuidos (como BBDD NoSQL)?",
            listOf(
                "Que no se pueden almacenar más de un trillón de datos",
                "Que un sistema distribuido solo puede garantizar simultáneamente dos de estas tres: Consistencia, Disponibilidad (Availability) y Tolerancia a Particiones",
                "Que todas las BBDD deben tener Claves Primarias",
                "Que la Nube es vulnerable a cortes"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En bases de datos relacionales, ¿qué es la Tercera Forma Normal (3NF)?",
            listOf(
                "Una tabla con tres columnas clave",
                "La regla que exige que la tabla esté en 2NF y que todos los atributos no clave dependan ÚNICA y directamente de la clave primaria, sin dependencias transitivas",
                "El cifrado de grado militar",
                "Una consulta que usa 3 JOINs"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Índice Clúster' (Clustered Index)?",
            listOf(
                "Un índice que se guarda en la nube",
                "Un índice que determina y altera el orden físico en el que los datos reales se almacenan en el disco",
                "Un índice secundario para búsquedas lentas",
                "Un servidor de respaldo"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué estructura de árbol de búsqueda balanceada utilizan por defecto casi todos los RDBMS modernos para implementar sus índices primarios?",
            listOf(
                "Binary Search Tree (BST)",
                "Árbol B / Árbol B+ (B-Tree)",
                "Trie",
                "Árbol Rojo-Negro"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Deadlock' o interbloqueo en BBDD?",
            listOf(
                "Un disco duro quemado",
                "Una situación donde dos transacciones se bloquean mutuamente esperando a que la otra libere los bloqueos sobre los recursos que ambas necesitan",
                "Un cierre programado de la base de datos",
                "Un intento de hackeo fallido"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Trigger' (Disparador) en una base de datos?",
            listOf(
                "Un tipo de virus de SQL",
                "Un fragmento de código SQL (procedimiento) que se ejecuta automáticamente en respuesta a un evento específico en una tabla (como INSERT, UPDATE o DELETE)",
                "Una alerta de espacio lleno en disco",
                "Un botón en la interfaz de usuario"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un Procedimiento Almacenado (Stored Procedure)?",
            listOf(
                "Un manual de usuario guardado en PDF",
                "Un conjunto de sentencias SQL precompiladas y guardadas en el servidor de la BBDD para ser ejecutadas repetidamente con alta eficiencia",
                "Una copia de seguridad en cinta",
                "Un log de errores del sistema"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué diferencia fundamental hay entre un CROSS JOIN y un INNER JOIN?",
            listOf(
                "El CROSS produce el producto cartesiano (todas las combinaciones posibles) sin condición, el INNER requiere una condición de igualdad",
                "El CROSS cruza servidores de red, el INNER es local",
                "Son el mismo comando",
                "El CROSS borra los datos nulos"
            ),
            0,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál de estos niveles de aislamiento de transacciones es el MÁS estricto y previene las lecturas sucias, irrepetibles y fantasmas?",
            listOf("Read Uncommitted", "Read Committed", "Repeatable Read", "Serializable"),
            3,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es una 'Lectura Fantasma' (Phantom Read)?",
            listOf(
                "Leer un archivo borrado",
                "Cuando una transacción lee un conjunto de filas que satisfacen una condición, y otra transacción inserta o borra filas que cambian ese resultado antes de terminar la primera",
                "Un error del disco duro fantasma",
                "Leer datos de otra base de datos secreta"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa la técnica de 'Sharding' en arquitectura de bases de datos?",
            listOf(
                "Añadir más memoria RAM al servidor (Escalado Vertical)",
                "Fragmentar y distribuir horizontalmente una gran base de datos a través de múltiples servidores o nodos distintos para mejorar el rendimiento",
                "Cifrar la base de datos con AES",
                "Agrupar todas las tablas en un solo archivo"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es 'Neo4j'?",
            listOf(
                "Un antivirus de red",
                "La base de datos orientada a Grafos (Graph Database) más popular, ideal para redes sociales o recomendaciones",
                "Un framework de frontend",
                "Un RDBMS clásico de Microsoft"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa ORM en programación backend relacionada con BBDD (ej. Hibernate, Entity Framework)?",
            listOf(
                "Object Relational Mapping (Mapeo Objeto-Relacional, conecta el código orientado a objetos con la base de datos SQL)",
                "Open Resource Memory",
                "Operating Random Machine",
                "Object Request Management"
            ),
            0,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es una inyección SQL (SQL Injection)?",
            listOf(
                "Insertar datos rápidamente",
                "Una vulnerabilidad de seguridad grave donde un atacante interfiere e inyecta código SQL malicioso en las consultas de la aplicación",
                "Un comando para migrar datos",
                "Actualizar el motor de la base de datos"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué tipo de base de datos NoSQL es 'Cassandra' de Apache?",
            listOf(
                "Base de datos de Familia de Columnas (Column-family) masivamente escalable",
                "Base de datos Relacional Pura",
                "Almacén de Grafos",
                "Sistema de archivos local"
            ),
            0,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En SQL, ¿qué función de ventana (Window Function) se utiliza para asignar un rango o posición única a cada fila dentro de una partición (ej. top ventas)?",
            listOf("POSITION()", "ROW_NUMBER() / RANK()", "INDEX()", "TOP_COUNT()"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál es el motor de almacenamiento predeterminado y más utilizado en MySQL moderno (soporta transacciones ACID y claves foráneas)?",
            listOf("MyISAM", "InnoDB", "Memory", "CSV"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En bases de datos de series temporales (Time-Series Databases), ¿cuál es el ejemplo más famoso, muy utilizado para monitorizar métricas y telemetría?",
            listOf("MySQL", "InfluxDB", "CouchDB", "Access"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando SQL se utiliza para combinar el conjunto de resultados de dos consultas diferentes (SELECTs) excluyendo registros duplicados?",
            listOf("JOIN", "COMBINE", "UNION", "MERGE"),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es un 'Plan de Ejecución' (Execution Plan) en SQL?",
            listOf(
                "El cronograma de backups",
                "La hoja de ruta que el motor de la BBDD genera para determinar la manera más óptima y eficiente de ejecutar una consulta (usando índices, scans, etc.)",
                "El algoritmo de cifrado",
                "Un documento en PDF del DBA"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué hace la sentencia COALESCE() en SQL?",
            listOf(
                "Suma todos los nulos",
                "Multiplica cadenas",
                "Evalúa una lista de argumentos y devuelve el primer valor que NO sea nulo",
                "Combina tablas aleatorias"
            ),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En MongoDB, ¿cuál es el equivalente a una 'Tabla' de SQL?",
            listOf("Documento", "Colección (Collection)", "Grafo", "Directorio"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En MongoDB, ¿cuál es el equivalente a un 'Registro/Fila' de SQL?",
            listOf("Colección", "Columna", "Documento (Document, formato BSON)", "Nodo"),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué técnica de optimización de BD consiste en almacenar resultados precalculados de consultas costosas en memoria (como Redis o Memcached)?",
            listOf("Indexing", "Sharding", "Caching (Caché)", "Clustering"),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué es 'Data Warehouse' (Almacén de Datos)?",
            listOf(
                "Un edificio donde se guardan discos duros rotos",
                "Un sistema que centraliza y consolida enormes volúmenes de datos históricos de múltiples fuentes, optimizado para análisis complejo (OLAP) y Business Intelligence",
                "Una tabla temporal en memoria",
                "Un servidor de red"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa OLTP frente a OLAP?",
            listOf(
                "Online Transaction Processing (Transacciones diarias rápidas) vs Online Analytical Processing (Análisis complejo de grandes datos históricos)",
                "Online Testing Phase vs Online Active Phase",
                "Ambos son lenguajes de programación obsoletos",
                "Open License Translation vs Open License Application"
            ),
            0,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En PostgreSQL o SQL Server, ¿qué es un CTE (Common Table Expression)?",
            listOf(
                "Una tabla que nunca se borra",
                "Un conjunto de resultados temporal con nombre, definido usando la cláusula WITH, que mejora la lectura y permite consultas recursivas",
                "Un error del compilador",
                "Un tipo de clave foránea"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Cuál de estas opciones en el comando DROP y DELETE es cierta sobre el espacio en disco en muchos RDBMS?",
            listOf(
                "DELETE libera el espacio en disco inmediatamente, DROP no",
                "DELETE no reduce automáticamente el tamaño del archivo en disco (espacio fragmentado), TRUNCATE o DROP sí liberan espacio directamente",
                "Ninguna libera espacio nunca",
                "Ambas formatean el disco duro físico"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué patrón arquitectónico distribuye los datos haciendo que haya un nodo 'Líder' que recibe las escrituras, y varios nodos 'Seguidores' que replican los datos para lecturas?",
            listOf(
                "Peer-to-Peer",
                "Master-Slave (o Leader-Follower) Replication",
                "Microservicios",
                "MVC"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En Bases de Datos de Grafos, los datos se representan mediante Nodos y...",
            listOf("Columnas", "Aristas o Relaciones (Edges)", "Filas", "Documentos"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué base de datos distribuida fue creada originalmente por Google y describió el concepto de Bigtable (clave-valor masivo)?",
            listOf(
                "Amazon DynamoDB",
                "Google Bigtable / Spanner",
                "Microsoft Azure SQL",
                "Oracle DB"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa la 'Concurrencia' en bases de datos?",
            listOf(
                "La velocidad máxima del disco",
                "El error de caída del servidor",
                "La capacidad del sistema para permitir a múltiples usuarios o procesos acceder y modificar los datos de forma simultánea de manera segura",
                "El tamaño máximo de una tabla"
            ),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿En qué tipo de almacenamiento NoSQL encaja el producto 'Elasticsearch'?",
            listOf(
                "Motor de búsqueda analítico basado en documentos (Full-Text Search Engine)",
                "Base de datos estrictamente relacional",
                "Base de datos de grafos",
                "Almacenamiento en caché bloqueante"
            ),
            0,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué cláusula SQL se utiliza habitualmente en consultas paginadas web para especificar cuántos registros mostrar y desde dónde empezar (ej. página 2)?",
            listOf("STOP AND GO", "LIMIT y OFFSET", "PAGINATE TO", "MAX_ROWS"),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "En una arquitectura de base de datos OLAP tipo 'Esquema de Estrella' (Star Schema), hay una gran tabla central rodeada de tablas secundarias. ¿Cómo se llama esa tabla central?",
            listOf(
                "Tabla Auxiliar",
                "Tabla de Dimensiones (Dimension Table)",
                "Tabla de Hechos (Fact Table)",
                "Tabla Maestra"
            ),
            2,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué modelo de consistencia utilizan muchas BBDD NoSQL distribuidas para primar la alta disponibilidad, asumiendo que los datos se sincronizarán en todos los nodos con el tiempo?",
            listOf(
                "Consistencia Estricta (Strict Consistency)",
                "Consistencia Eventual (Eventual Consistency)",
                "Consistencia Linealizable",
                "Consistencia Cero"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué significa el término 'ETL' en el ecosistema de bases de datos y Business Intelligence?",
            listOf(
                "Execute, Test, Launch",
                "Extraer, Transformar y Cargar (Extract, Transform, Load)",
                "External Table Link",
                "Encrypted Text Language"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),
        Pregunta(
            "¿Qué comando o lenguaje se usaría en MongoDB para buscar documentos donde la edad sea mayor a 18?",
            listOf(
                "SELECT * FROM users WHERE age > 18",
                "db.users.find({ age: { \$gt: 18 } })",
                "GET users WHERE age > 18",
                "MATCH(u:User) WHERE u.age > 18"
            ),
            1,
            "Difícil",
            "Bases de Datos"
        ),

        // ==========================================
        // CATEGORÍA: GENERAL - NIVEL: FÁCIL (40)
        // ==========================================
        Pregunta(
            "¿Quién es el cofundador principal de la empresa Microsoft y creador de Windows?",
            listOf("Steve Jobs", "Mark Zuckerberg", "Bill Gates", "Elon Musk"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué empresa tecnológica fundaron Steve Jobs, Steve Wozniak y Ronald Wayne en un garaje?",
            listOf("Microsoft", "Google", "Apple", "IBM"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cuál es la red social más grande del mundo, fundada por Mark Zuckerberg en 2004?",
            listOf("Twitter", "Instagram", "Facebook", "TikTok"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama la popular plataforma de vídeos cortos creada por la empresa china ByteDance?",
            listOf("YouTube", "Snapchat", "TikTok", "Vimeo"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué famoso empresario fundó las compañías Tesla, SpaceX y compró la red social Twitter (ahora X)?",
            listOf("Jeff Bezos", "Elon Musk", "Tim Cook", "Larry Page"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cuál es el buscador de internet más utilizado a nivel mundial?",
            listOf("Bing", "Yahoo", "Google", "DuckDuckGo"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué significa conectar un dispositivo mediante 'Wi-Fi'?",
            listOf(
                "Conectarlo por cable USB al PC",
                "Conectarlo a una red de área local y a internet de forma inalámbrica mediante ondas de radio",
                "Enviarle fotos mediante láser",
                "Conectarlo directamente a un satélite espacial"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama la tecnología inalámbrica de corto alcance usada para conectar auriculares, teclados o móviles entre sí?",
            listOf("Wi-Fi", "Infrarrojos", "Bluetooth", "NFC"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué aplicación de mensajería instantánea del icono verde es la más usada en Europa y Latinoamérica, y pertenece a Meta?",
            listOf("Telegram", "WhatsApp", "Signal", "Skype"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué componente del ordenador utilizas para mover el cursor o flecha en la pantalla?",
            listOf("El teclado", "El ratón (Mouse)", "La impresora", "El altavoz"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué significa la sigla 'USB' presente en cables y pendrives?",
            listOf(
                "Universal Serial Bus (Bus Serie Universal)",
                "United States Broadcasting",
                "Ultra Speed Band",
                "Unified System Base"
            ),
            0,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué dispositivo emite la luz y muestra la interfaz gráfica de un ordenador o móvil?",
            listOf("El micrófono", "El procesador", "La pantalla / Monitor", "El router"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama el 'cerebro' del ordenador que procesa todas las instrucciones?",
            listOf("Memoria RAM", "Disco Duro", "CPU o Microprocesador", "Tarjeta Gráfica"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Para qué se utiliza la cámara web (Webcam)?",
            listOf(
                "Para imprimir fotos",
                "Para capturar y transmitir vídeo en tiempo real, muy usada en videollamadas",
                "Para escanear códigos de barras",
                "Para aumentar el sonido"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un 'Smartphone'?",
            listOf(
                "Un teléfono de disco antiguo",
                "Un teléfono móvil inteligente con pantalla táctil, conexión a internet y capacidad de instalar aplicaciones",
                "Un reloj de pared digital",
                "Una consola de videojuegos portátil"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cuál es la tienda oficial para descargar aplicaciones en los móviles Android?",
            listOf("App Store", "Google Play Store", "Windows Store", "Amazon Appstore"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cuál es la tienda oficial para descargar aplicaciones en los iPhone de Apple?",
            listOf("App Store", "Play Store", "Cydia", "iTunes Store"),
            0,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué plataforma es el líder mundial en transmisión de vídeos y fue comprada por Google en 2006?",
            listOf("Twitch", "Dailymotion", "YouTube", "Netflix"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un 'Email' o correo electrónico?",
            listOf(
                "Un mensaje de voz",
                "Un sistema de envío y recepción de mensajes, textos y archivos digitales a través de internet",
                "Un servicio de entrega de paquetes de Amazon",
                "Un programa para hacer llamadas"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué símbolo debe llevar SIEMPRE una dirección de correo electrónico entre el nombre de usuario y el servidor?",
            listOf("#", "&", "@ (Arroba)", "*"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es 'Netflix'?",
            listOf(
                "Un navegador web",
                "Un antivirus",
                "Una plataforma de streaming por suscripción para ver películas y series por internet",
                "Una red social de fotos"
            ),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué hace un 'Router' en tu casa?",
            listOf(
                "Imprime documentos por WiFi",
                "Conecta tus dispositivos a internet y crea tu red Wi-Fi local",
                "Almacena todas tus películas",
                "Enfría el ordenador"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cuál es la función principal de un 'Antivirus'?",
            listOf(
                "Hacer el ordenador más rápido",
                "Limpiar el polvo de la pantalla",
                "Detectar, bloquear y eliminar software malicioso (malware) del sistema",
                "Conectar el equipo a internet"
            ),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué famoso servicio de correo electrónico ofrece Google?",
            listOf("Outlook", "Yahoo Mail", "Gmail", "Hotmail"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama la pequeña pieza de hardware que almacena datos de forma portátil y se conecta al USB del PC?",
            listOf("CD-ROM", "Disquete", "Memoria USB o Pendrive", "Tarjeta Gráfica"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un teclado QWERTY?",
            listOf(
                "Un teclado que solo sirve en inglés",
                "La distribución o diseño de teclado más común, nombrada así por sus primeras seis letras superiores izquierda",
                "Un teclado con luces de colores",
                "Un teclado sin números"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es una dirección IP en términos sencillos?",
            listOf(
                "La marca del procesador",
                "El nombre de tu archivo de texto",
                "La contraseña de tu WiFi",
                "El identificador numérico único que tiene cada dispositivo conectado a una red o a internet"
            ),
            3,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué servicio en línea, creado por Jeff Bezos, comenzó vendiendo libros y hoy es la tienda online más grande del mundo?",
            listOf("eBay", "Alibaba", "Amazon", "AliExpress"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué red social está enfocada principalmente en el ámbito laboral, currículums y contactos profesionales?",
            listOf("Tinder", "LinkedIn", "Snapchat", "Pinterest"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un 'Hacker' en el vocabulario general (a menudo confundido con cracker)?",
            listOf(
                "Un experto informático capaz de encontrar vulnerabilidades y acceder a sistemas o redes con profundos conocimientos de seguridad",
                "Un usuario que no sabe usar el ratón",
                "Un creador de juegos de mesa",
                "Un vendedor de ordenadores"
            ),
            0,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué red social se caracteriza por mensajes cortos (antes de 140, ahora 280 caracteres) y fue renombrada a 'X'?",
            listOf("Facebook", "Instagram", "Twitter", "Reddit"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué popular videojuego consiste en bloques pixelados tridimensionales y mundos infinitos de construcción y supervivencia, comprado por Microsoft?",
            listOf("Fortnite", "Minecraft", "Super Mario Bros", "Roblox"),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué consola de videojuegos híbrida (portátil y de mesa) lanzó Nintendo en 2017?",
            listOf("PlayStation 5", "Xbox One", "Nintendo Switch", "Wii U"),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué dispositivo de muñeca incluye sensores para contar pasos, pulso cardíaco y notificaciones del móvil?",
            listOf(
                "Smartphone",
                "Smartwatch (Reloj Inteligente)",
                "Gafas de realidad virtual",
                "Auricular Bluetooth"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es 'Wikipedia'?",
            listOf(
                "Un diccionario privado y de pago",
                "Una enciclopedia digital libre, multilingüe y colaborativa editada por voluntarios en todo el mundo",
                "Una web de noticias deportivas",
                "El blog personal de Bill Gates"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué tecnología se utiliza para realizar pagos móviles sin contacto acercando el teléfono al datáfono?",
            listOf(
                "Infrarrojo",
                "Bluetooth 1.0",
                "NFC (Near Field Communication)",
                "Conexión satelital"
            ),
            2,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué significan las siglas WWW que se ponían al principio de las direcciones web?",
            listOf("World Wide Web", "World Wireless Web", "Web Windows Word", "Wide Web World"),
            0,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión .mp3?",
            listOf(
                "Una imagen",
                "Un archivo de sonido o música comprimido",
                "Un documento de texto",
                "Un virus de ordenador"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión .mp4 o .avi?",
            listOf(
                "Un archivo de audio",
                "Un archivo de vídeo",
                "Un juego instalado",
                "Un archivo comprimido"
            ),
            1,
            "Fácil",
            "General"
        ),
        Pregunta(
            "¿Qué debes hacer SIEMPRE para evitar que alguien congele o robe tu información cuando dejas tu PC o móvil solo en público?",
            listOf(
                "Romper la pantalla",
                "Cerrar la sesión o bloquear el dispositivo con contraseña/huella",
                "Desenchufarlo de la corriente",
                "Ponerlo boca abajo"
            ),
            1,
            "Fácil",
            "General"
        ),

        // ==========================================
        // CATEGORÍA: GENERAL - NIVEL: MEDIO (40)
        // ==========================================
        Pregunta(
            "¿Quién es considerado el 'padre' de la World Wide Web, al inventar el lenguaje HTML, HTTP y el primer navegador en el CERN (1989)?",
            listOf("Tim Berners-Lee", "Alan Turing", "Vint Cerf", "Linus Torvalds"),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué significa 'URL' (ej. https://www.google.com)?",
            listOf(
                "Universal Right Location",
                "Uniform Resource Locator (Localizador Uniforme de Recursos, la dirección única de una página web)",
                "Unified Routing Link",
                "User Record Locator"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es el 'Phishing' (Suplantación de identidad) en ciberseguridad?",
            listOf(
                "Atacar a los peces de un acuario",
                "Un ataque físico al router",
                "Un engaño donde el atacante se hace pasar por una entidad de confianza (ej. un banco por email) para robar contraseñas o tarjetas",
                "Instalar cámaras ocultas"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué tipo de malware secuestra los archivos del ordenador cifrándolos y pide un rescate económico (generalmente en Bitcoin) para recuperarlos?",
            listOf("Spyware", "Adware", "Troyano", "Ransomware"),
            3,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué significan la 'S' final en el protocolo 'HTTPS' de los navegadores?",
            listOf(
                "System",
                "Speed",
                "Secure (Seguro, indica que la conexión está cifrada mediante SSL/TLS)",
                "Server"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es el lenguaje HTML?",
            listOf(
                "Un lenguaje de programación avanzado como C++",
                "El lenguaje de marcado estándar utilizado para crear y estructurar el contenido de las páginas web",
                "Un formato para comprimir vídeos",
                "Una base de datos de texto"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué fue 'ENIAC', terminado en 1945?",
            listOf(
                "El primer teléfono móvil",
                "El primer sistema operativo de Microsoft",
                "Una de las primeras computadoras electrónicas de propósito general, enorme y que usaba válvulas de vacío",
                "El primer satélite ruso"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué tecnología o concepto central está detrás de criptomonedas como el Bitcoin, actuando como un libro de contabilidad público, inmutable y descentralizado?",
            listOf(
                "Inteligencia Artificial",
                "Bases de datos SQL Server",
                "Blockchain (Cadena de bloques)",
                "Computación Cuántica"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿En qué año presentó Steve Jobs el primer modelo de iPhone, revolucionando la industria de los smartphones?",
            listOf("2003", "2007", "2010", "2000"),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es la computación 'en la Nube' (Cloud Computing)?",
            listOf(
                "El uso de redes satelitales cuando el cielo está nublado",
                "La entrega de servicios informáticos (servidores, almacenamiento, software) a través de Internet, en lugar de en discos locales",
                "Guardar archivos en un pendrive inalámbrico",
                "Un nuevo formato de disco óptico"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué significan las siglas VPN?",
            listOf(
                "Video Playing Network",
                "Virtual Private Network (Red Privada Virtual, crea una conexión segura y cifrada a través de internet ocultando la IP)",
                "Very Private Number",
                "Visual Processing Node"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué hace un servidor DNS (Domain Name System) en internet?",
            listOf(
                "Bloquea los virus web",
                "Acelera las descargas de vídeos",
                "Traduce los nombres de dominio legibles (ej. google.com) a sus correspondientes direcciones IP numéricas para conectar los servidores",
                "Aloja las páginas web físicamente"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Cuál es el límite máximo del protocolo de direcciones IPv4 (actualmente agotadas)?",
            listOf(
                "Aproximadamente 4.300 millones de direcciones IP",
                "Un millón",
                "Infinita capacidad",
                "100 mil millones"
            ),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama la versión moderna de direcciones IP, creada para resolver el agotamiento de IPv4, y que utiliza formato hexadecimal?",
            listOf("IPv5", "IPv6", "IPx", "IP-Next"),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es un archivo con extensión '.zip' o '.rar'?",
            listOf(
                "Un archivo ejecutable de sistema",
                "Un documento cifrado de la policía",
                "Un archivo comprimido que contiene uno o más archivos o carpetas ocupando menos espacio",
                "Una imagen sin pérdida"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "En el contexto web, ¿qué son las 'Cookies'?",
            listOf(
                "Pequeños fragmentos de texto que las webs envían al navegador del usuario para recordar información sobre su visita o iniciar sesión automáticamente",
                "Virus destructivos",
                "Un juego secreto de Google",
                "Los botones de la página de inicio"
            ),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué función cumple la memoria RAM (Random Access Memory)?",
            listOf(
                "Guarda los archivos para siempre, incluso apagado el PC",
                "Es el procesador de la tarjeta gráfica",
                "Almacena temporalmente los datos y programas que la CPU está utilizando de forma activa en ese momento, borrándose al apagar",
                "Es el cable de internet"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es la 'Latencia' o 'Ping' en una conexión a internet (especialmente en juegos online)?",
            listOf(
                "La velocidad máxima de descarga de un archivo grande",
                "El tiempo de retraso en milisegundos que tarda un paquete de datos en ir de tu equipo al servidor y volver",
                "La cantidad de virus detectados",
                "La potencia de la señal WiFi a través de muros"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es el ancho de banda (Bandwidth) en redes?",
            listOf(
                "La longitud física del cable Ethernet",
                "La cantidad máxima de datos que se pueden transmitir a través de una conexión de red en un periodo determinado (ej. Megabits por segundo)",
                "El tamaño del monitor",
                "La frecuencia del procesador"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Cuál de estas opciones describe un sistema de 'Autenticación de dos factores' (2FA)?",
            listOf(
                "Poner dos contraseñas distintas al mismo tiempo",
                "Escribir tu contraseña dos veces",
                "Acceder combinando algo que sabes (contraseña) con algo que tienes (un código SMS, App o token físico) para mayor seguridad",
                "Entrar a dos cuentas a la vez"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es GitHub?",
            listOf(
                "Un foro de debates políticos",
                "Una plataforma basada en la nube para alojar y compartir código fuente usando el sistema de control de versiones Git, comprada por Microsoft",
                "Un lenguaje de programación moderno",
                "Una marca de discos duros"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Quién es el matemático británico que formalizó los conceptos de algoritmo y computación con su 'Máquina', y fue clave descifrando el código Enigma en la 2ª Guerra Mundial?",
            listOf("Charles Babbage", "Alan Turing", "John von Neumann", "Nikola Tesla"),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué compañía es la creadora de la potente serie de tarjetas gráficas 'GeForce' y se ha convertido en la líder del hardware para Inteligencia Artificial?",
            listOf("Intel", "AMD", "NVIDIA", "Qualcomm"),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es el 'Open Source' (Código Abierto)?",
            listOf(
                "Software que se ejecuta con la puerta abierta",
                "Software pirata o ilegal",
                "Software cuyo código fuente es público y libremente accesible para que cualquiera pueda estudiarlo, modificarlo y distribuirlo",
                "Un ordenador sin carcasa protectora"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué empresa fundó Larry Page y Sergey Brin en 1998 en la Universidad de Stanford?",
            listOf("Google", "Yahoo", "Amazon", "Facebook"),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es un 'CaptCha' (las pruebas de 'No soy un robot' o seleccionar semáforos)?",
            listOf(
                "Un sistema de pago",
                "Un test de inteligencia visual",
                "Un sistema de prueba de Turing pública automatizada para distinguir usuarios humanos de bots automatizados y prevenir spam",
                "Un virus informático de imágenes"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué lenguaje de programación popularizó la frase 'Escríbelo una vez, ejecútalo en cualquier lugar' gracias a su Máquina Virtual (JVM)?",
            listOf("C#", "Python", "Java", "C++"),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es la 'Ley de Moore'?",
            listOf(
                "Una ley penal contra hackers",
                "La observación empírica de que el número de transistores en un microprocesador se duplica aproximadamente cada dos años, reduciendo su coste y aumentando su potencia",
                "La regla de que el software siempre tiene errores",
                "La ley física de las baterías de litio"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "En almacenamiento, ¿cuántos Gigabytes (GB) hay aproximadamente en 1 Terabyte (TB)?",
            listOf("10 GB", "100 GB", "1000 GB (o 1024 GB en sistema binario)", "10.000 GB"),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es un sistema de archivos 'Peer-to-Peer' (P2P), popularizado por programas como BitTorrent o eMule?",
            listOf(
                "Una red de servidores centrales gigantes",
                "Una red descentralizada donde los ordenadores de los usuarios (nodos) comparten archivos directamente entre sí, sin depender de un servidor central",
                "Una conexión WiFi directa a una impresora",
                "Un formato de vídeo HD"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué significa 'FPS' en el mundo del gaming y el vídeo?",
            listOf(
                "Fast Playing Server",
                "Frames Per Second (Fotogramas por Segundo, la fluidez de la imagen)",
                "First Person System",
                "Format Player Sound"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿A qué género de videojuegos pertenecen títulos competitivos por equipos en un mapa con bases como 'League of Legends' (LoL) o 'Dota 2'?",
            listOf("MMORPG", "Shooter", "MOBA (Multiplayer Online Battle Arena)", "Battle Royale"),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es 'Linux' originalmente, creado por Linus Torvalds en 1991?",
            listOf(
                "El núcleo (kernel) de un sistema operativo libre y de código abierto",
                "Un navegador de internet finlandés",
                "El primer smartphone táctil",
                "Un lenguaje de diseño web"
            ),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿En qué se diferencian un disco duro tradicional (HDD) de un disco de estado sólido (SSD)?",
            listOf(
                "Son exactamente iguales por dentro",
                "El HDD usa discos magnéticos giratorios y agujas, mientras que el SSD usa chips de memoria flash sin partes móviles, siendo el SSD muchísimo más rápido y resistente",
                "El HDD es para internet y el SSD para juegos",
                "El SSD funciona con discos de cristal óptico"
            ),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué significa la 'C' en la unidad central de procesamiento CPU?",
            listOf(
                "Core (Núcleo)",
                "Computer (Computadora)",
                "Central (Central)",
                "Control (Control)"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué famosa página web utiliza el lema 'Broadcast Yourself' (Emite tú mismo) en su origen?",
            listOf("Twitch", "YouTube", "MySpace", "Vine"),
            1,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué tecnología de red móvil promete altísimas velocidades, latencia casi nula y conectividad masiva (Internet de las Cosas), sucediendo al 4G/LTE?",
            listOf("Wi-Fi 6", "Bluetooth 5.0", "5G", "Fibra Óptica Móvil"),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué es 'Spotify'?",
            listOf(
                "Un radar de aviones en tiempo real",
                "Una tienda de ropa online",
                "Un servicio líder de streaming digital para escuchar música, podcasts y vídeos de todo el mundo",
                "Un software de edición fotográfica"
            ),
            2,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Cómo se llama la práctica de registrar tu marca, idea o invento tecnológico en internet usando un nombre de dominio antes que la empresa real para luego venderlo a precios inflados?",
            listOf("Cybersquatting (Ciberocupación)", "Phishing", "Spoofing", "Doxing"),
            0,
            "Medio",
            "General"
        ),
        Pregunta(
            "¿Qué programa informático logró derrotar al campeón mundial de ajedrez Garry Kasparov en 1997?",
            listOf("AlphaGo", "Deep Blue (creado por IBM)", "Watson", "HAL 9000"),
            1,
            "Medio",
            "General"
        ),

        // ==========================================
        // CATEGORÍA: GENERAL - NIVEL: DIFÍCIL (40)
        // ==========================================
        Pregunta(
            "¿Cómo se llamó la primera red de computadoras a gran escala, precursora directa de Internet, creada por el Departamento de Defensa de EE. UU. en 1969?",
            listOf("NSFNET", "CYCLADES", "ARPANET", "MILNET"),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Quién es considerada la primera programadora de la historia, tras escribir el primer algoritmo procesable por la Máquina Analítica de Babbage en el siglo XIX?",
            listOf("Grace Hopper", "Ada Lovelace", "Margaret Hamilton", "Hedy Lamarr"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es un ataque DDoS en ciberseguridad?",
            listOf(
                "Distribuir virus por disquetes",
                "Un ataque de 'Denegación de Servicio Distribuido' que satura a un servidor web inundándolo de tráfico basura desde múltiples dispositivos (botnet) hasta que colapsa",
                "Descifrar contraseñas matemáticas avanzadas",
                "Destruir la placa base forzando el procesador"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En criptografía, ¿qué es RSA?",
            listOf(
                "Un organismo de inteligencia ruso",
                "Un protocolo de red antiguo",
                "Un algoritmo de cifrado asimétrico ampliamente utilizado en internet que usa una clave pública para cifrar y una clave privada para descifrar",
                "Un hardware para generar números aleatorios"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué fue el conocido 'Efecto 2000' o 'Y2K Bug'?",
            listOf(
                "Un virus creado el 1 de enero de 2000",
                "Un fallo potencial mundial debido a que los sistemas informáticos antiguos guardaban los años con solo dos dígitos (ej. '99'), y el '00' sería interpretado como el año 1900",
                "Una caída global de los satélites",
                "El colapso de la naciente red de Facebook"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué famoso virus informático/gusano descubierto en 2010 fue diseñado específicamente para sabotear centrifugadoras nucleares físicas de Irán (guerra cibernética)?",
            listOf("ILOVEYOU", "WannaCry", "Stuxnet", "Mydoom"),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significa la sigla 'API' fundamental en el desarrollo de software moderno?",
            listOf(
                "Application Programming Interface (Interfaz de Programación de Aplicaciones, permite que dos aplicaciones de software se comuniquen entre sí)",
                "Automated Process Internet",
                "Application Path Index",
                "Advanced Peripheral Input"
            ),
            0,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En arquitectura de computadores clásica, ¿cuál es el principio clave de la arquitectura de Von Neumann?",
            listOf(
                "Separar físicamente la RAM de la ROM",
                "Que tanto los datos a procesar como el propio programa (instrucciones) se almacenan juntos en la misma memoria principal de lectura/escritura",
                "Usar procesadores multi-núcleo siempre",
                "Cifrar todos los datos del bus del sistema"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué protocolo es el núcleo responsable del enrutamiento del tráfico en el corazón de Internet (las 'carreteras principales'), conectando a todos los proveedores de internet (ISPs)?",
            listOf("HTTP", "BGP (Border Gateway Protocol)", "FTP", "DHCP"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Cuál es la unidad básica de información en la Computación Cuántica?",
            listOf(
                "El Bit",
                "El Qubit (Quantum Bit, que puede representar 0, 1 o una superposición de ambos simultáneamente)",
                "El Qubyte",
                "El Quantum Core"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significan los términos 'Frontend' y 'Backend' en desarrollo web?",
            listOf(
                "Frontend es la interfaz que ve y usa el usuario final, Backend es la lógica del servidor, base de datos e infraestructura oculta que lo hace funcionar",
                "Frontend es Windows, Backend es Linux",
                "Son marcas de frameworks de JavaScript",
                "Frontend es para redes, Backend es para almacenamiento"
            ),
            0,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué lenguaje de programación es 'Brainfuck'?",
            listOf(
                "Un lenguaje muy rápido usado en finanzas",
                "Un lenguaje de diseño gráfico",
                "Un 'lenguaje esotérico' minimalista y extremadamente difícil de leer por humanos, con solo 8 instrucciones básicas como + - > <",
                "El lenguaje oficial de Microsoft Azure"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En el modelo OSI de redes informáticas, ¿cuántas capas teóricas existen?",
            listOf(
                "5 capas",
                "3 capas",
                "7 capas (Física, Enlace, Red, Transporte, Sesión, Presentación, Aplicación)",
                "10 capas"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En el modelo OSI, ¿en qué capa opera una dirección IP local (enrutamiento IP)?",
            listOf(
                "Capa 1 (Física)",
                "Capa 2 (Enlace de datos)",
                "Capa 3 (Red)",
                "Capa 7 (Aplicación)"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En el modelo OSI, ¿en qué capa opera una dirección MAC física (conmutación switch)?",
            listOf(
                "Capa 1 (Física)",
                "Capa 2 (Enlace de datos)",
                "Capa 3 (Red)",
                "Capa 4 (Transporte)"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es la 'Web Oscura' (Dark Web)?",
            listOf(
                "Páginas web con el fondo negro",
                "Una parte de la Deep Web intencionalmente oculta y anónima que requiere software especial como Tor para acceder, a menudo asociada con mercados ilegales",
                "Las páginas que ya no existen",
                "La intranet secreta de Google"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué matemático estadounidense inventó el Álgebra de Boole, base de la lógica binaria moderna usada en circuitos digitales?",
            listOf("George Boole", "Claude Shannon", "John McCarthy", "David Hilbert"),
            0,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Quién es conocido por publicar en 1948 'Una teoría matemática de la comunicación', fundando la teoría de la información y acuñando el término 'bit'?",
            listOf("Alan Turing", "Claude Shannon", "Marvin Minsky", "Vannevar Bush"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significa la sigla 'JSON', formato estándar de intercambio de datos muy ligero?",
            listOf(
                "Java Standard Output Network",
                "JavaScript Object Notation",
                "Jumbled String Oriented Node",
                "Java Sync Online Navigator"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿En el contexto de estándares de internet, qué son los documentos 'RFC' (Request for Comments)?",
            listOf(
                "Errores del servidor",
                "Quejas de los usuarios en foros",
                "Documentos técnicos oficiales publicados por la IETF que describen especificaciones, protocolos (como IP, TCP) y procedimientos de Internet",
                "Códigos promocionales de compra web"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué técnica maliciosa altera directamente las tablas DNS del router local o del servidor para redirigir tráfico legítimo hacia webs falsas, sin enviar links de phishing al usuario?",
            listOf("Farming", "Pharming", "Vishing", "Spoofing DNS / Caché Poisoning"),
            3,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Cuál es el sistema de cifrado estándar avanzado mundial adoptado por el gobierno de EE. UU. (sucesor de DES) usado desde WiFi hasta discos duros?",
            listOf("MD5", "AES (Advanced Encryption Standard)", "Blowfish", "SHA-256"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es un 'Ataque de Día Cero' (Zero-Day Exploit)?",
            listOf(
                "Un ataque que ocurre a las 00:00 horas",
                "Un ciberataque que aprovecha una vulnerabilidad de software completamente nueva y desconocida por los desarrolladores, por lo que no hay parche de seguridad disponible aún",
                "Un ataque físico a los servidores destruyéndolos",
                "Un borrado completo del disco duro que lo deja en cero"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significan las siglas 'IoT'?",
            listOf(
                "Internet of Things (Internet de las Cosas: la red de dispositivos físicos cotidianos, vehículos y electrodomésticos conectados a internet y compartiendo datos)",
                "Input Output Technology",
                "Internal Operating Test",
                "Integrated Object Terminal"
            ),
            0,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Quién o quiénes publicaron en 2008 el Whitepaper (documento técnico) original de Bitcoin bajo seudónimo?",
            listOf("Vitalik Buterin", "Satoshi Nakamoto", "Dorian Nakamoto", "Hal Finney"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significa 'DevOps' en la industria del software?",
            listOf(
                "Development and Operations, una cultura y práctica que unifica el desarrollo de software y la administración de la infraestructura de TI para hacer entregas continuas y rápidas",
                "Un lenguaje para crear videojuegos de operaciones militares",
                "Device Options (Opciones de dispositivo en el panel de control)",
                "Un grupo de hackers informáticos"
            ),
            0,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En Inteligencia Artificial y Machine Learning, ¿qué es el 'Deep Learning' (Aprendizaje Profundo)?",
            listOf(
                "Leer libros densos de tecnología",
                "Una subcategoría del Machine Learning basada en Redes Neuronales Artificiales con múltiples capas (profundas) diseñadas para imitar el aprendizaje del cerebro humano",
                "Un robot que limpia los fondos de las piscinas",
                "El código fuente oculto del kernel"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué famoso sistema de IA basado en redes neuronales de la empresa DeepMind logró vencer al campeón mundial del milenario juego de mesa Go en 2016?",
            listOf("Deep Blue", "Stockfish", "AlphaGo", "Siri"),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué significan las siglas 'OLED' en tecnología de pantallas de alta calidad modernas?",
            listOf(
                "Optical Lens Emitting Device",
                "Organic Light-Emitting Diode (Diodo orgánico de emisión de luz, donde cada píxel emite su propia luz sin requerir panel trasero)",
                "Original Liquid Electronic Display",
                "Over-Layered Energy Display"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué empresa británica diseña la arquitectura subyacente de procesadores RISC que utilizan prácticamente el 99% de los smartphones actuales (Apple, Qualcomm, Samsung)?",
            listOf("Intel", "AMD", "ARM", "IBM"),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué fue el proyecto 'Apollo Guidance Computer' (AGC) de la NASA en 1969?",
            listOf(
                "El primer PC comercial para el hogar",
                "Un sistema de antenas de televisión",
                "El ordenador digital súper avanzado (para la época) instalado a bordo de las misiones Apolo que proporcionó cálculo y control para el alunizaje",
                "Un simulador de videojuegos en el MIT"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es la 'Ingeniería Social' en el contexto de la ciberseguridad?",
            listOf(
                "Mejorar las redes sociales para hacer amigos",
                "El arte de manipular psicológicamente a las personas para que revelen información confidencial o rompan procedimientos de seguridad por su cuenta, sin hackeo técnico",
                "Desarrollar infraestructuras web para ONGs",
                "Algoritmos que analizan likes en Facebook"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En telecomunicaciones por fibra óptica, ¿qué fenómeno físico fundamental permite que el haz de luz viaje por dentro del fino cable de cristal curvo sin escapar?",
            listOf(
                "Refracción atómica",
                "Reflexión interna total",
                "Difracción cuántica",
                "Efecto Doppler"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es el 'Test de Turing' propuesto en 1950?",
            listOf(
                "Una prueba para medir la temperatura del procesador",
                "Una prueba de esfuerzo de baterías eléctricas",
                "Un examen para determinar la habilidad de una máquina para exhibir comportamiento inteligente indistinguible del de un humano en una conversación",
                "El primer captcha de la historia"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué hace exactamente el hardware TPM (Trusted Platform Module) que Microsoft exige como requisito en las placas base modernas para Windows 11?",
            listOf(
                "Mejora los FPS de los videojuegos antiguos",
                "Es un microchip criptográfico dedicado y seguro que almacena claves, certificados y contraseñas por hardware para proteger el arranque del sistema operativo contra hackeos",
                "Convierte conexiones de red lentas a fibra óptica",
                "Es la tarjeta de sonido de alta fidelidad"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿En qué lenguaje está escrito principalmente el núcleo operativo (Kernel) subyacente de Linux o Windows y sistemas de altísimo rendimiento donde controlar la memoria es vital?",
            listOf("Python", "Java", "C y C++", "Ruby"),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué es el sistema de numeración 'Hexadecimal', fundamental en informática (ej. para representar colores web #FF0000 o direcciones MAC)?",
            listOf(
                "Un sistema de base 8 que usa números del 0 al 7",
                "Un sistema que usa solo 0s y 1s",
                "Un sistema de base 16 que utiliza los dígitos del 0 al 9 y las letras de la A a la F",
                "Un sistema basado en código Morse"
            ),
            2,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿Qué protocolo seguro es el estándar de la industria (utilizando el puerto 22) para conectar y administrar servidores remotos de forma cifrada mediante terminal de comandos?",
            listOf("Telnet", "SSH (Secure Shell)", "FTP", "RDP"),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "En el contexto web, ¿qué es una arquitectura 'REST' o API RESTful?",
            listOf(
                "Un servidor que está en modo reposo (Sleep Mode)",
                "Un estilo arquitectónico de software estandarizado que usa los métodos HTTP (GET, POST, PUT, DELETE) para crear servicios web interactivos sin estado",
                "Un navegador obsoleto de los años 90",
                "Un sistema de recuperación de datos borrados"
            ),
            1,
            "Difícil",
            "General"
        ),
        Pregunta(
            "¿A quién se le atribuye la acuñación original del término 'Bug' (Bicho/Insecto) informático después de encontrar literalmente una polilla real atrapada en un relé de la computadora Mark II en 1947?",
            listOf("Alan Turing", "Charles Babbage", "Grace Hopper", "Tim Berners-Lee"),
            2,
            "Difícil",
            "General"
        )
    )

    fun getPregunta(dificultad: String, categoria: String): List<Pregunta> {
        return preguntas.filter { it.dificultad == dificultad && it.categoria == categoria }
            .shuffled()
            .take(10)
    }
}