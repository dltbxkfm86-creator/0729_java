package com.kh.network.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) {
		/*
		 * ��Ʈ��ũ(Network)
		 * 
		 * ��� ������ �� �� �̻��� ��ġ���� ������ �Ǵ� �������� ������ ȯ��
		 * ��Ʈ��ũ�� ���� : �������� ��ȯ
		 * 
		 * ����� ������ ��ġ�� �Ϲ������� Host��� ��Ī�ϸ�, ���ܰ��� ���� ��� ��ġ�� EndPoint��� ǥ��
		 * 
		 * MAC(Media Access Controller) Address / IP(Internet Protocol) Address
		 * 
		 * - MAC Address : NIC(Network Interface Card)�� ���� ������ �ٿ����� �������� �ּ�
		 * 
		 * - IP Address : Internet�󿡼� �� Host���� �ĺ��� �� �ִ� ������ �ּ�
		 * 
		 * - Port Number : Host ���ο��� �۵��ϴ� Process�� �ĺ��� �� ����ϴ� ���� ��ȣ
		 * 
		 * 
		 * MAC => �̷л� ���� ������ => ���� �������� �÷��� �����
		 * 
		 * => IP�ּҿ� Port��ȣ�� �׻� �������� �ƴ϶� ������ ������ �������� ��
		 * 	  ��, ���� �ٲܶ� IP�ּҴ� ���� ��Ʈ��ũ ���� �ȿ���, Port��ȣ�� ��ǻ�� ���ο���
		 * 	  �ߺ��� �߻��Ǿ �ȵ�!! �浿�� �Ͼ!!!
		 * 
		 * - Server�� Client
		 * 
		 * Server : Client(�����)���� ���񽺸� �������ִ� �������� ��ǻ�� �Ǵ� ���α׷�
		 * 			��, Client�� ��û�� ���� ������ �������ִ� ���� ������
		 * 
		 * Client : Server���� ���񽺸� ��û�ϴ� �������� ��ǻ�� �Ǵ� ���α׷�
		 * 			��, ���񽺸� �����޴� ��
		 * 
		 * => ������ �ڱ� ȥ�� ������ ���� �� ����! Ŭ���̾�Ʈ�� ��û�� ���;߸� ������ ���� �� �ִ� ����
		 * 
		 * => Ŭ���̾�Ʈ�� ������ ��û�� ������ ���ؼ� ������ IP�ּҿ� Port��ȣ�� �˾ƾ� ��
		 * 
		 */
		
		// InetAddress : ��Ʈ��ũ ������ Ȯ���� �� �ִ� Ŭ����
		
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			// localHost : ���� ���α׷��� ���۽�Ų ��ġ�� �ǹ�
			// getLocalHost() : �۾��ϰ� �ִ� Host�� ������ ��ȯ���ִ� �޼ҵ�
			
			System.out.println(localHost); // PC�̸� / IP�ּ�
			System.out.println(localHost.getHostName());
			System.out.println(localHost.getHostAddress());
			
			System.out.println("=================================");
			
			// �����γ����� ���ؼ� ������ǻ�Ϳ� ���õ� ������ ��� �� �� ����
			// DomainName : ����ڰ� ���񽺸� �̿��� �� ������ IP�ּҸ� �ܿ�� �����ϱ�
			//				�ܿ�� ������� ����ڿ��� �����Ǵ� �̸�
			// www.google.com -> hosts���� -> DNS(Domain Name System)
			// google������ IP�ּҸ� ������ �������� HTTP(s)��û
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : �����γ����� �̿��� ������ ������ ��ȯ
			
			System.out.println(googleHost);
			System.out.println(googleHost.getHostName());
			System.out.println(googleHost.getHostAddress());
			// ������ �л걸���� �̷���� ����
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		/*
		 * Client - Server Model
		 * 
		 * ���� �������� ������ �����Ѵٸ� Ŭ���̾�Ʈ�� ������ ������ ��û�� ���� �� ����
		 * => ������ ���� ����� ���� �־����
		 * 
		 * "��û(request)"�� "����(response)"���� ���α׷��� ����(���)��
		 * �������� ��� ��� : HTTPS(Hyper Text Transfer Protocol Secure)
		 * 
		 * ���� �ڹٸ��� ����ؼ� Ŭ���̾�Ʈ�� ������ ������ ��� �غ���
		 * 
		 * ����(Socket)
		 * 
		 * Process(���α׷��� �޸𸮿� ����� ����) ���� ����� ���
		 */
		
	}

}
