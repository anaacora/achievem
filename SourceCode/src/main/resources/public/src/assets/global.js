export const url='https://d7332454-a4f6-49c4-9be4-4f4bbd192afb.mock.pstmn.io';
export const id=1;

export function getColorByCategory(category) {
  let color ="";
  if (category === "Education") {
    color="purple";
  }
  else if (category === "Health & Food") {
    color="blue";
  }
  else if (category === "Lifestyle") {
    color="green";
  }
  else if (category === "Sports") {
    color="orange";
  }
  else
  {
    color="grey";
  }

  return color;
}

