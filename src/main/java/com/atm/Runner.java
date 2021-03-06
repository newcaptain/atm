package com.atm;

import com.atm.mapper.UserMapper;
import com.atm.pojo.User;
import com.atm.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Scanner;

/**
 * Create by Administrator
 *
 * @author sola
 * @date 2019/03/28 9:30
 */

public class Runner {
	@Autowired
	private PaymentListener paymentListener;
	@Autowired
	private UserService userService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private WelfareService welfareService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserMessageService userMessageService;
	@Autowired
	private StockService stockService;

	public static Integer ID;
	public static User user;


	public void service(){
		do{
			user = userService.loggingController();
			ID = user.getuId();
		}while(user == null);

		while(true)
		{
			user = userMapper.selectByPrimaryKey(ID);
			System.out.println("\n--------------------------------------------\n1. 存钱\n2. 取钱\n3." +
					" 转账\n4. 缴费\n5. 公益\n6. 查询\n7. 消息\n8. 投资\n0. 退卡\n--------------------------------------------\n请输入您的选择：");
			Scanner cin = new Scanner(System.in);
			int num = cin.nextInt();
			switch (num) {
				case 1:
					userService.saveMoney(ID);
					break;
				case 2:
					userService.drawMoney(ID);
					break;
				case 3:
					userService.transfer(ID);
					break;
				case 4:
					paymentService.paymentStart(ID);
					break;
				case 5:
					welfareService.start();
					break;
				case 6:
					userService.query(Runner.ID);
					break;
				case 7:
					userMessageService.queryMessage(Runner.ID);
					break;
				case 8:
					stockService.stockServiceControl();
					break;
				case 0:
					System.out.println("退卡成功\n");
					System.exit(0);
			}
		}

	}
}
