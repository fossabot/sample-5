package jp.macs.workweb.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.macs.workweb.domain.entity.auth.UserRoleAccount;
import jp.macs.workweb.domain.entity.auth.UserSecurityAccount;
import jp.macs.workweb.domain.entity.user.Users;
import jp.macs.workweb.domain.entity.user.UsersCriteria;
import jp.macs.workweb.domain.repository.auth.UsersExtMapper;
import jp.macs.workweb.domain.repository.auth.UsersMapper;


@Service
public class UsersService implements UserDetailsService {
	@Autowired
	UsersMapper usersMapper;
	
	@Autowired
	UsersExtMapper usereExtMapper;
	
	public List<Users> selectAll(UsersCriteria criteria){
		return usersMapper.selectByExample(criteria);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username==null) {
            throw new UsernameNotFoundException("���[�U�[������͂��Ă�������");
        }
        //�w�肵�����[�U�[��������UserPass�I�u�W�F�N�g���擾����
        
        //Users users = usersMapper.selectByPrimaryKey(Integer.parseInt(username));
        UserRoleAccount account=usereExtMapper.getUserRoleAccount(Integer.parseInt(username));
        System.out.println(account);
        if(account == null){
            throw new UsernameNotFoundException("���[�U�[��������܂���");
        }
//        if(users == null){
//            throw new UsernameNotFoundException("���[�U�[��������܂���");
//        }
		return new UserSecurityAccount(account);
	};

}
