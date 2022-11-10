package org.example.view;

import org.example.dao.DaoFactory;
import org.example.model.Contato;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContatoView {
    private JTextField txtIdContato;
    private JTextField txtNome;
    private JTextField txtEmail;
    private JTextField txtFone;
    private JTextArea textObservacao;
    private JButton inserirButton;
    private JButton atualizarButton;
    private JButton excluirButton;
    private JButton sairButton;
    private JPanel painelContato;

    public JPanel getPainelContato() {
        return painelContato;
    }

    public ContatoView() {
        txtIdContato.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                //Buscar o contato
                Contato contato = null;
                contato = DaoFactory.em.find(Contato.class, Integer.parseInt(txtIdContato.getText()));
                if(contato!=null){
                    txtNome.setText(contato.getNome());
                    txtEmail.setText(contato.getEmail());
                    txtFone.setText(contato.getTelefone());
                    textObservacao.setText(contato.getObservacao());
                    inserirButton.setEnabled(false);
                    atualizarButton.setEnabled(true);
                } else  {
                    limparCampos();
                    inserirButton.setEnabled(true);
                    atualizarButton.setEnabled(false);
                }
            }
        });
        inserirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Contato contato = new Contato();
                getContato(contato);
                DaoFactory.em.getTransaction().begin();
                DaoFactory.em.persist(contato);
                DaoFactory.em.getTransaction().commit();
                JOptionPane.showMessageDialog(null,
                        "Contato Cadastrado Com Sucesso",
                        "Pronto!",
                        JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                txtIdContato.setText(null);
                txtIdContato.requestFocus();
            }
        });
        atualizarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int id = Integer.parseInt(txtIdContato.getText());
                Contato c = DaoFactory.em.find(Contato.class, id);
                c.setNome(txtNome.getText());
                c.setTelefone(txtFone.getText());
                c.setObservacao(textObservacao.getText());
                c.setEmail(txtEmail.getText());
                DaoFactory.em.getTransaction().begin();
                DaoFactory.em.merge(c);
                DaoFactory.em.getTransaction().commit();
                JOptionPane.showMessageDialog(null,
                        "Contato Atualizado Com Sucesso",
                        "Pronto!",
                        JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                txtIdContato.setText(null);
                txtIdContato.requestFocus();
            }
        });
        excluirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int idContato = Integer.parseInt(txtIdContato.getText());
                Contato c = DaoFactory.em.find(Contato.class, idContato);
                if(c != null){
                    DaoFactory.em.getTransaction().begin();
                    DaoFactory.em.remove(c);
                    DaoFactory.em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null,
                            "Registro excluído com sucesso",
                            "Pronto!",
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Contato não encontrado",
                            "Erro",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public void getContato(Contato contato) {

        contato.setNome(txtNome.getText());
        contato.setEmail(txtEmail.getText());
        contato.setTelefone(txtFone.getText());
        contato.setObservacao(textObservacao.getText());

    }

    private void limparCampos() {
        txtNome.setText(null);
        txtEmail.setText(null);
        txtFone.setText(null);
        textObservacao.setText(null);
    }

    public JPanel getPanelContato() {
        return painelContato;
    }
}
