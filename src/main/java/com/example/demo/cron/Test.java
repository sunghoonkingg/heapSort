package com.example.demo.cron;


import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class Test {
                public static void main(String[] args) {


                    Comparator<ProductNdxpro> productNdxproComparator = new Comparator<ProductNdxpro>() {
                        @Override
                        public int compare(ProductNdxpro o1, ProductNdxpro o2) {
                            return o1.getStandard().compareTo(o2.getStandard());
                        }
                    };

                    ArrayList<ProductNdxpro> productNdxpros = new ArrayList<>();

                    productNdxpros.add(new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2,"FY"));
                    productNdxpros.add(new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4,"PY"));
                    productNdxpros.add(new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5,"RD"));
                    productNdxpros.add(new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1,"FL"));
                    productNdxpros.add(new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3,"PL"));



                    Collections.sort(productNdxpros);

                    System.out.println(productNdxpros);


                    // PF SF PN SN RD

                    //만약에 새로운 인덱스가 들어왔으면 그 인덱스에 뭐를 체크해서 하는데

                    // 그거에 대한 기준을 뭐로 잡을까

                    // NFLOW NFLOW NDXPRO NDXPRO R&D


                }}




//        ProductNdxpro productNdxpro = new ProductNdxpro("PN", "라이선스 (NDX Pro)", "라이선스", "NDX PRO", 3);
//
//        ProductNdxpro productNflow = new ProductNdxpro("PF", "라이선스 (NFLOW)", "라이선스", "NFLOW", 1);
//
//        ProductNdxpro serivceNdxpro = new ProductNdxpro("SN", "용역 (NDX Pro)", "용역", "NDX PRO", 4);
//
//        ProductNdxpro serviceNflow = new ProductNdxpro("SF", "용역 (NFLOW)", "용역", "NFLOW", 2);
//
//        ProductNdxpro rANd = new ProductNdxpro("RD", "R&D/지원사업", "R&D", "R&D", 5);
//
//        ProductNdxpro ndxpro = new ProductNdxpro("N", "NDXPRO", "type", "detailLabel", 0);
//
//        ProductNdxpro nflow = new ProductNdxpro("F", "NFLOW", "type", "detailLabel", 0);
//
//        ProductNdxpro rd = new ProductNdxpro("D", "R&D", "type", "detailLabel", 0);
//





