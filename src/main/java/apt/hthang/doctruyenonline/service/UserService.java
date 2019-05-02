package apt.hthang.doctruyenonline.service;

import apt.hthang.doctruyenonline.entity.User;
import apt.hthang.doctruyenonline.exception.HttpMyException;
import apt.hthang.doctruyenonline.projections.ConveterSummary;

/**
 * @author Huy Thang
 */
public interface UserService {

    /**
     * Tìm kiếm User theo username
     *
     * @param userName
     * @return User - Nếu tồn tại user với userName / null - nếu không tồn tại user với userName
     */
    User findUserAccount(String userName);
    
    /**
     * Đăng ký người dùng mới
     *
     * @param user
     * @return true - nếu đăng ký thành công / false - nếu có lỗi xảy ra
     */
    boolean registerUser(User user);
    
    /**
     * Tìm User Theo UserName và Email
     *
     * @param userName
     * @param email
     * @return User
     */
    User findForgotUser(String userName, String email);
    
    /**
     * Cập Nhật User
     *
     * @param user
     * @return User
     */
    User updateUser(User user);
    
    /**
     * Tìm user theo Id
     *
     * @param id
     * @return User - nếu tồn tại / null- nếu không tồn tại user
     */
    User findUserById(Long id);
    
    /**
     * Lấy Thông Tin Converter
     *
     * @param id
     * @return ConverterSummary
     */
    ConveterSummary findConverterByID(Long id);
    
    /**
     * Kiểm tra DisplayName đã tồn tại chưa
     *
     * @param userId
     * @param newNick
     * @return boolean
     */
    boolean checkUserDisplayNameExits(Long userId, String newNick);
    
    /**
     * Cập nhật ngoại hiệu
     *
     * @param userId
     * @param money
     * @param newNick
     */
    void updateDisplayName(Long userId, Double money, String newNick) throws Exception;
    
    /**
     * Cập nhật notification  của User
     *
     * @param userId
     * @param newNotification
     * @return void
     */
    void updateNotification(Long userId, String newNotification);
    
    /**
     * Cập nhật ảnh địa diện
     * @param userId
     * @param url
     */
    void updateAvatar(Long userId, String url);

    /**
     * Kiểm tra có tồn tại user theo
     * @param userId
     * @param password
     * @return true - nếu tồn tại / false - nếu không tồn tại
     */
    boolean checkUserByIdAndPassword(Long userId, String password);

    /**
     * Cập nhật Mật Khẩu
     * @param userId
     * @param url
     */
    void updatePassword(Long userId, String password);
}
