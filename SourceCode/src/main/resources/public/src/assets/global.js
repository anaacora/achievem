export const url = 'https://706ea100-c721-458d-b895-53c5e4444218.mock.pstmn.io';
export const id = 1;

export function getColorByCategory(category) {
  let color = "";
  if (category === "Education") {
    color = "purple";
  } else if (category === "Health & Food") {
    color = "blue";
  } else if (category === "Lifestyle") {
    color = "green";
  } else if (category === "Sports") {
    color = "orange";
  } else {
    color = "grey";
  }
  return color;
}