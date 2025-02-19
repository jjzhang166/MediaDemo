package com.yk.media.opengles.render;

public interface RenderConstants {
    /**
     * 处理类型
     */
    interface Process {
        /**
         * 相机
         */
        int CAMERA = 0;

        /**
         * 视频
         */
        int VIDEO = 1;

        /**
         * 图像
         */
        int IMAGE = 2;

        /**
         * 拍照
         */
        int TAKE_PHOTO = 3;

        /**
         * 录像
         */
        int RECORD_VIDEO = 4;
    }

    /**
     * 滤镜
     */
    interface Filter {
        /**
         * 原画
         */
        int NORMAL = -1;

        /**
         * 均值模糊
         */
        int MEAN_BLUR = 0;

        /**
         * 高斯模糊
         */
        int GAUSSIAN_BLUR = 1;

        /**
         * 灰度滤镜
         */
        int GRAY = 2;

        /**
         * 画中画
         */
        int PIP = 3;

        /**
         * 运动模糊
         */
        int MOTION_BLUR = 4;

        /**
         * 缩放
         */
        int SCALE = 5;

        /**
         * 扭曲
         */
        int SKEW = 6;

        /**
         * 蓝线挑战（横向）
         */
        int BLUE_LINE_CHALLENGE_H = 7;

        /**
         * 蓝线挑战（纵向）
         */
        int BLUE_LINE_CHALLENGE_V = 8;

        /**
         * 保留帧
         */
        int RETAIN_FRAME = 9;
    }

    /**
     * 转场特效
     */
    interface Transition {
        /**
         * 普通
         */
        int NORMAL = -1;

        /**
         * 混合
         */
        int MIX = 0;

        /**
         * 模糊
         */
        int BLUR = 1;

        /**
         * 推镜
         */
        int PUSH = 2;

        /**
         * 拉镜
         */
        int PULL = 3;

        /**
         * 旋涡
         */
        int VORTEX = 4;

        /**
         * 左移
         */
        int LEFT_MOVE = 5;

        /**
         * 右移
         */
        int RIGHT_MOVE = 6;

        /**
         * 上移
         */
        int TOP_MOVE = 7;

        /**
         * 下移
         */
        int DOWN_MOVE = 8;

        /**
         * 左上移
         */
        int LEFT_TOP_MOVE = 9;

        /**
         * 右上移
         */
        int RIGHT_TOP_MOVE = 10;

        /**
         * 左下移
         */
        int LEFT_DOWN_MOVE = 11;

        /**
         * 右下移
         */
        int RIGHT_DOWN_MOVE = 12;

        /**
         * 翻页
         */
        int PAGE_UP = 13;

        /**
         * 分割一
         */
        int CUT_1 = 14;

        /**
         * 分割二
         */
        int CUT_2 = 15;

        /**
         * 分割三
         */
        int CUT_3 = 16;

        /**
         * 分割四
         */
        int CUT_4 = 17;

        /**
         * 水平翻转
         */
        int FLIP_HORIZONTAL = 18;

        /**
         * 垂直翻转
         */
        int FLIP_VERTICAL = 19;
    }

    /**
     * 转场特效2
     */
    interface Transition2 {
        /**
         * 普通
         */
        int NORMAL = -1;

        /**
         * 移动向上
         */
        int MOVE_UP = 0;

        /**
         * 移动向下
         */
        int MOVE_DOWN = 1;

        /**
         * 移动向左
         */
        int MOVE_LEFT = 2;

        /**
         * 移动向右
         */
        int MOVE_RIGHT = 3;

        /**
         * 移动向左上
         */
        int MOVE_LEFT_UP = 4;

        /**
         * 移动向右上
         */
        int MOVE_RIGHT_UP = 5;

        /**
         * 移动向左下
         */
        int MOVE_LEFT_DOWN = 6;

        /**
         * 移动向右下
         */
        int MOVE_RIGHT_DOWN = 7;

        /**
         * 抹掉向左
         */
        int WIPE_LEFT = 8;

        /**
         * 抹掉向右
         */
        int WIPE_RIGHT = 9;

        /**
         * 抹掉向上
         */
        int WIPE_UP = 10;

        /**
         * 抹掉向下
         */
        int WIPE_DOWN = 11;

        /**
         * 抹掉向左上
         */
        int WIPE_LEFT_UP = 12;

        /**
         * 抹掉向右下
         */
        int WIPE_RIGHT_DOWN = 13;

        /**
         * 抹掉向左下
         */
        int WIPE_LEFT_DOWN = 14;

        /**
         * 抹掉向右上
         */
        int WIPE_RIGHT_UP = 15;

        /**
         * 抹掉中心
         */
        int WIPE_CENTER = 16;

        /**
         * 抹掉圆形
         */
        int WIPE_CIRCLE = 17;
    }
}
