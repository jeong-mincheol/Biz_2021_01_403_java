package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.IolistVO;
import com.callor.iolist.service.IolistService;

public class IolistServiceImplV1 implements IolistService {

	private List<IolistVO> ioList;

	public IolistServiceImplV1() {
		ioList = new ArrayList<IolistVO>();
	}

	@Override
	public void loadFile() {
		String fileName = "src/com/callor/iolist/매입매출데이터.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {
				String reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				String lists[] = reader.split(",");
				IolistVO vo = new IolistVO(lists[0], lists[4], lists[5], lists[6], Integer.valueOf(lists[7]),
						Integer.valueOf(lists[8]), Integer.valueOf(lists[9]), Integer.valueOf(lists[10]));
				ioList.add(vo);
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void sortPrice() {
		for(IolistVO vo : ioList) {
			if(vo.getIntsort() == 1) {
				int purchasePrice = vo.getPurchase() * vo.getCount();
				vo.setPurTotal(purchasePrice);
				vo.setSaleTotal(0);
			} else if(vo.getIntsort() == 2) {
				int salesPrice = vo.getSales() * vo.getCount();
				vo.setSaleTotal(salesPrice);
				vo.setPurTotal(0);
			}
		}
	}

	@Override
	public void printFile() {
		this.sortPrice();
		System.out.println("===========================================");
		System.out.println("거래일자\t상품이름\t거래처\t매입금액\t판매금액");
		System.out.println("-------------------------------------------");
		
		for(IolistVO vo : ioList) {
			System.out.print(vo.getDate() + "\t");
			System.out.print(vo.getProduct() + "\t");
			System.out.print(vo.getAccount() + "\t");
			System.out.print(vo.getPurTotal() + "\t");
			System.out.print(vo.getSaleTotal() + "\n");
		}

	}

}
