package org.example.chainOfResponsibility;

/**
 * @author 夏先鹏
 * @date 2019/12/21
 * @time 17:39
 */
public class PMRequestHandle implements RequestHandle {

    private RequestHandle rh;

    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("加薪，项目经理审批");
        } else {
            rh.handleRequest(request);
        }
    }
}
