function validateForm(event) {
      // 获取输入框的值
      const username = document.getElementById('username').value;
      const password = document.getElementById('password').value;

      // 检查长度
      if (username.length > 10 || password.length > 10) {
          // 阻止表单提交
          event.preventDefault();
          alert('您的账号/密码长度过长，请检查重新输入');
      }
  }