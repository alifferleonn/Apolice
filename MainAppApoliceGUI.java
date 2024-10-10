package Apolice;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainAppApoliceGUI {
    private JFrame frame;
    private ArrayList<apolice> apolices;

    public MainAppApoliceGUI() {
        apolices = new ArrayList<>();
        frame = new JFrame("Gestão de Apólice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        panel.setBackground(new Color(245, 245, 245));
        frame.add(panel);
        placeComponents(panel, constraints);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel, GridBagConstraints constraints) {
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Criar e Ver Apólices");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        panel.add(titleLabel, constraints);

        JLabel numeroLabel = new JLabel("Número da Apólice:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        panel.add(numeroLabel, constraints);

        JTextField numeroText = new JTextField(20);
        constraints.gridx = 1;
        panel.add(numeroText, constraints);

        JLabel nomeLabel = new JLabel("Nome:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(nomeLabel, constraints);

        JTextField nomeText = new JTextField(20);
        constraints.gridx = 1;
        panel.add(nomeText, constraints);

        JLabel idadeLabel = new JLabel("Idade:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(idadeLabel, constraints);

        JTextField idadeText = new JTextField(20);
        constraints.gridx = 1;
        panel.add(idadeText, constraints);

        JLabel sexoLabel = new JLabel("Sexo:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(sexoLabel, constraints);

        JComboBox<Sexo> sexoComboBox = new JComboBox<>(Sexo.values());
        constraints.gridx = 1;
        panel.add(sexoComboBox, constraints);

        JLabel valorLabel = new JLabel("Valor do Automóvel:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(valorLabel, constraints);

        JTextField valorText = new JTextField(20);
        constraints.gridx = 1;
        panel.add(valorText, constraints);

        JButton criarButton = new JButton("Criar Apólice");
        criarButton.setBackground(new Color(76, 175, 80));
        criarButton.setForeground(Color.WHITE);
        criarButton.setFocusPainted(false);
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(criarButton, constraints);

        JButton verButton = new JButton("Ver Dados das Apólices");
        verButton.setBackground(new Color(33, 150, 243));
        verButton.setForeground(Color.WHITE);
        verButton.setFocusPainted(false);
        constraints.gridx = 1;
        panel.add(verButton, constraints);

        criarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apolice novaApolice = new apolice();
                try {
                    novaApolice.setNumero(Integer.parseInt(numeroText.getText()));
                    novaApolice.setNome(nomeText.getText());
                    novaApolice.setIdade(Integer.parseInt(idadeText.getText()));
                    novaApolice.setSexo((Sexo) sexoComboBox.getSelectedItem());
                    novaApolice.setValorAutomovel(Double.parseDouble(valorText.getText()));
                    apolices.add(novaApolice);
                    JOptionPane.showMessageDialog(frame, "Apólice criada com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        verButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!apolices.isEmpty()) {
                    showApplianceData();
                } else {
                    JOptionPane.showMessageDialog(frame, "Nenhuma apólice foi criada.");
                }
            }
        });
    }

    private void showApplianceData() {
        JFrame dataFrame = new JFrame("Dados das Apólices");
        dataFrame.setSize(300, 300);
        dataFrame.setLocationRelativeTo(null);

        String[] columnNames = {"Campo", "Valor"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        for (apolice ap : apolices) {
            tableModel.addRow(new Object[]{"Número", ap.getNumero()});
            tableModel.addRow(new Object[]{"Nome", ap.getNome()});
            tableModel.addRow(new Object[]{"Idade", ap.getIdade()});
            tableModel.addRow(new Object[]{"Sexo", ap.getSexo()});
            tableModel.addRow(new Object[]{"Valor do Automóvel", ap.getValorAutomovel()});
            tableModel.addRow(new Object[]{"Valor da Apólice", ap.calcularValor()});
            tableModel.addRow(new Object[] {"", ""});
        }

        dataFrame.add(tableScrollPane);
        dataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainAppApoliceGUI();
    }
}
