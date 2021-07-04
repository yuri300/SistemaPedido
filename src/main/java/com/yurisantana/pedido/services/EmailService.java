package com.yurisantana.pedido.services;

import org.springframework.mail.SimpleMailMessage;

import com.yurisantana.pedido.domain.Cliente;
import com.yurisantana.pedido.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
