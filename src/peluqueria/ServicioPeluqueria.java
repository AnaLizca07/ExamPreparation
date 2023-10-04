package peluqueria;

public enum ServicioPeluqueria {
    CORTE("Shaggy","estilo de corte de pelo a capas definidas que realzan los rasgos del rostro (como un peinado contour),\n esculpen y aportan mucho movimiento y volumen al cabello",25000){
        @Override
        public String mostrarDescripcionServicio() {
            return "El cabello en capas es excelente para crear la ilusión de largo o volumen. Es un estilo versátil y que casi cualquier persona puede lucir.\n Aunque el cabello en capas es un estilo espectacular, por lo general, necesita más cuidado que un corte básico.";
        }
    },
    UÑAS("Navideñas","Uñas tipo almendra largas de colores verdes, rojos y con piedritas",45000){
        @Override
        public String mostrarDescripcionServicio() {
            return "Utiliza el aceite a diario, focalizándote en el nacimiento de la uña y, por el contrario, con una capa que emplees del endurecedor\n será suficiente para apreciarlas más fuertes al instante y, después de 3 días, menos frágiles, más suaves, saludables y con un brillo saludable.";
        }
    },
    TINTE("Morado","Tinte ultra pigmentante de color morado oscuro",15000){
        @Override
        public String mostrarDescripcionServicio() {
            return "Coloca la toalla sobre tus hombros y comienza a distribuir la tintura. Empieza por las raíces,\n masajea y luego extiende hacia largos y, por último, puntas. Cuando hayas terminado toda la cabellera, espera 35 minutos antes de enjuagar.";
        }
    };

    public String nombre;
    public String descripcion;
    public Integer precio;

    ServicioPeluqueria(String nombre, String descripcion, Integer precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public abstract String mostrarDescripcionServicio();
}
