package bridge.view;

import bridge.util.ErrorCode;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    private static final String START_MESSAGE = "다리 건너기 게임을 시작합니다.";
    private static final String TOTAL_RESULT_INFO_MESSAGE = "최종 게임 결과";
    private static final String TOTAL_SUCCESS_RESULT = "게임 성공 여부: ";
    private static final String TOTAL_TRIALS = "총 시도한 횟수: ";

    public void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap(String upsideMap, String downsideMap) {
        System.out.println(upsideMap);
        System.out.println(downsideMap);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(String upsideMap, String downsideMap, String totalResult, int totalTrials) {
        System.out.println();
        System.out.println(TOTAL_RESULT_INFO_MESSAGE);
        System.out.println(upsideMap);
        System.out.println(downsideMap);
        System.out.println();
        System.out.println(TOTAL_SUCCESS_RESULT + totalResult);
        System.out.println(TOTAL_TRIALS + totalTrials);
    }

    public void printErrorMessage(ErrorCode errorCode) {
        System.out.println(errorCode.getMessage());
    }
}
