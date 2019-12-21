package org.example.chainOfResponsibility;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 17:58
 */
public class Test {

    public static void main(String[] args) {
        //hr
        HRRequestHandle hr = new HRRequestHandle();
        //项目经理
        PMRequestHandle pm = new PMRequestHandle(hr);
        // 项目组长
        TLRequestHandle tl = new TLRequestHandle(pm);

        Request request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("--------------------");
        request = new AddMoneyRequest();
        tl.handleRequest(request);

        System.out.println("--------------------");

        request = new DimissionRequest();
        pm.handleRequest(request);

    }
}
