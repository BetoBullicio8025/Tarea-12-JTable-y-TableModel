import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Wrapper;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JTable tblTabla;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private modeloTablaJuego modelo;
    private ArrayList<VIdeojuego> info;
    private JScrollPane scroll;

    public Ventana(String title) throws HeadlessException {
        super(title);

        this.setSize(500, 700);
        layout = new GridLayout(2, 1);
        this.setLayout(layout);
        // Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(219, 148, 148));
        lblId = new JLabel("Id:");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);

        lblPeso = new JLabel("Peso:");
        txtPeso = new JTextField(5);
        panel1.add(txtPeso);
        panel1.add(lblPeso);

        lblPlataforma = new JLabel("Plataforma:");
        txtPlataforma = new JTextField(15);
        panel1.add(txtPlataforma);
        panel1.add(lblPlataforma);

        lblDesarrollador = new JLabel("Desarrollador:");
        txtDesarrollador = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);

        btnAgregar = new JButton("Agregar juego ");
        panel1.add(btnAgregar);


        this.getContentPane().add(panel1, 0);

        // Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(159, 192, 139));
        this.getContentPane().add(panel2, 1);

        info = new ArrayList<>();
        info.add(new VIdeojuego(0, "Apex Legends", "Battle Royale", 109, "Multiplataforma", "Respawn"));
        modelo = new modeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);


        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VIdeojuego nuevo = new VIdeojuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoEnGb(Integer.parseInt(txtPeso.getText() ));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrrollador(txtDesarrollador.getText());

                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });

    }
}
