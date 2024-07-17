document.addEventListener("DOMContentLoaded", () => {
  const section_detail = document.querySelector("section.student.detail");

  const btn_list = document.querySelector("button.list");
  const btn_update = document.querySelector("button.update");
  const btn_delte = document.querySelector("button.delete");

  btn_list?.addEventListener("click", () => {
    document.location.href = `${roofPath}/`;
  });
  btn_delte?.addEventListener("click", () => {
    if (confirm("정말 학생정보 삭제할까요?")) {
      const st_num = e.target.dataset.st_num;
      document.location.replace = `${roofPath}/delete?st_num=${st_num}`;
    }
  });
});
