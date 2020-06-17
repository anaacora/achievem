export const url='https://24f493dc-1ecd-497e-9718-1be06d69237d.mock.pstmn.io';
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

